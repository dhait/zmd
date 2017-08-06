package org.optionmetrics.zmd.core.section;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class SectionProcessor {

    private Path currentDir;
    private Path toolkitDir;
    private List<Path> sectionPath = new ArrayList<>();

    SectionProcessor(Path toolkitDir) {
        this.currentDir = Paths.get(".").toAbsolutePath().normalize();
        this.toolkitDir = toolkitDir;
    }

    public List<Section> process(String name) throws Exception {
        List<Section> sections = sortSections(name);
        //expandDefinitions(sections);
        return sections;
    }

    public void addToSectionPath(Path path) {
        sectionPath.add(path);
    }

    private List<Paragraph> load(Path source) throws IOException {

        CharStream stream = CharStreams.fromPath(source);
        SectionLexer lexer = new SectionLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SectionParser parser = new SectionParser(tokens);
        ParserRuleContext tree = parser.specification();
        ParseTreeWalker walker = new ParseTreeWalker();
        SectionListener listener  = new SectionListener();
        walker.walk(listener, tree);
        // check errors
        for (String k : listener.defines.keySet()) {
            System.out.println(k + ":" + listener.defines.get(k));
        }
        return listener.paragraphs;
    }

    private Set<String> sectionsToParents(Collection<Section> sections) {
        Set<String> parents = new HashSet<>();
        for (Section s : sections) {
            parents.addAll(s.getParents());
        }
        return parents;
    }
    private List<Paragraph> filenameToParagraphs(List<Path> directories, String name) throws IOException {
        List<Paragraph> paragraphs;
        String fname = name + ".z";
        Path target = null;
        for (Path d : directories) {
            if (Files.exists(d.resolve(fname))) {
                target = d.resolve(fname);
                break;
            }
        }
        if (target != null) {
            paragraphs = load(target);
        }
        else {
            throw new IOException("File: " + fname + " not found!");
        }
        return paragraphs;
    }


    private List<Paragraph> filenameToParagraphs(String name) throws IOException {
        List<Path> directories = new ArrayList<>();
        directories.add(toolkitDir);
        directories.addAll(sectionPath);
        directories.add(currentDir);
        return filenameToParagraphs(directories, name);
    }


    private List<Paragraph> addHeader(String name) throws IOException {
        List<Paragraph> ps = filenameToParagraphs(name);

        // split this list of paragraphs into two parts
        List<Paragraph> pref = new ArrayList<>();
        List<Paragraph> suff = new ArrayList<>(ps);
        while (!suff.isEmpty() && !(suff.get(0) instanceof SectionHeader)) {
            pref.add(suff.get(0));
            suff.remove(0);
        }

        String tname = name;

        if (pref.isEmpty()) {
            if (!suff.isEmpty() && !((SectionHeader) suff.get(0)).getSectionName().equals(tname)) {
                SectionHeader h = new SectionHeader();
                h.setSectionName(tname);
                ps.add(0, h);
            }
        } else if (pref.stream().noneMatch(p->(p instanceof Formal))) { // pref contains no formals)
            SectionHeader h = new SectionHeader();
            h.setSectionName(tname);
            h.getParents().add("standard_toolkit");
            ps.add(0, h);
        } else {
            SectionHeader h = new SectionHeader();
            h.setSectionName(tname + "informal");
            ps.add(0, h);
        }
        return ps;
    }

    public List<Section> filenameToSections(String name) throws IOException {
        List<Section> sections = new ArrayList<Section>();
        List<Paragraph> ps = addHeader(name);
        if (ps.size() == 0)
            return sections;
        Section s = null;
        for (Paragraph p : ps) {
            if (p instanceof SectionHeader) {
                if (s != null)
                    sections.add(s);
                s = new Section();
            }
            s.getParagraphs().add(p);
        }
        if (s.getParagraphs().size() > 0)
            sections.add(s);
        return sections;
    }


    private Set<Section> readSpec(Set<String> names, Set<Section> sections) throws IOException {
        Set<Section> ss = new HashSet<>();
        if (sections != null)
            ss.addAll(sections);
        if (names.isEmpty())
            return ss;

        Set<Section> ss2 = new HashSet<>();
        for (String n : names) {
            Set<Section> f2s = new HashSet<>(filenameToSections(n));
            ss2.addAll(f2s);
        }

        //prepare first param
        Set<String> firstParam = sectionsToParents(ss2);
        List<String> snames = ss.stream().map(s->s.toName()).collect(Collectors.toList());
        firstParam.removeAll(snames);
        firstParam.removeAll(names);

        //second param
        ss2.addAll(ss);

        return readSpec(firstParam, ss2);
    }

    private List<Section> orderSections(Set<Section> sections) throws Exception {

        List<Section>  sorted = new ArrayList<>();

        boolean done = false;
        while (!done) {
            Optional<Section> n = sections.stream().filter(Section::isUnmarked).findFirst();
            if (n.isPresent()) {
                visit(n.get(), sections, sorted);
            } else {
                done = true;
            }
        }
        Optional<Section> prelude = sorted.stream().filter(s->s.toName().equals("prelude"))
                .findFirst();
        if (prelude.isPresent()) {
            sorted.remove(prelude.get());
            sorted.add(0, prelude.get());
        }
        return sorted;
    }

    private void visit(Section n, Set<Section> sections, List<Section> sorted) throws Exception {
        if (n.isPermMark())
            return;
        if (n.isTempMark()) {
            throw new Exception("Cycle present");
        }
        n.setTempMark(true);
        List<String> parents = n.getParents();
        for (String p : parents) {
            Optional<Section> ps = sections.stream()
                    .filter(s->s.toName().equals(p)).findFirst();
            if (ps.isPresent())
                visit(ps.get(), sections, sorted);
        }
        n.setPermMark(true);
        sorted.add(n);
    }

    private List<Section> sortSections(String name) throws Exception {
        Set<String> names = new HashSet<>();
        names.add(name);
        names.add("prelude");
        Set<Section> sections = readSpec(names, null);
        return orderSections(sections);
    }

    private void expandDefinitions(Map<String, String> definitions,
                                   List<Section> sections ) {
        for (Section s : sections) {
            s.expandDefinitions(definitions);
        }
    }
}
