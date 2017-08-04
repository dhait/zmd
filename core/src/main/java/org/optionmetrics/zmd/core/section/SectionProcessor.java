package org.optionmetrics.zmd.core.section;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

import static org.optionmetrics.zmd.core.section.SectionLexer.section;

public class SectionProcessor {

    private Path currentDir;
    private Path toolkitDir;
    private List<Path> sectionPath = new ArrayList<>();

    SectionProcessor(Path toolkitDir) {
        this.currentDir = Paths.get(".").toAbsolutePath().normalize();
        this.toolkitDir = toolkitDir;
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
        return listener.paragraphs;
    }

    public String sectionToName(Section s) {
        return ((SectionHeader)s.getParagraphs().get(0)).getSectionName();
    }

    public Set<String> sectionsToParents(Collection<Section> sections) {
        Set<String> parents = new HashSet<>();
        for (Section s : sections) {
            SectionHeader header = (SectionHeader) s.getParagraphs().get(0);
            parents.addAll(header.getParents());
        }
        return parents;
    }
    public List<Paragraph> filenameToParagraphs(List<Path> directories, String name) throws IOException {
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


    public List<Paragraph> filenameToParagraphs(String name) throws IOException {
        List<Path> directories = new ArrayList<>();
        directories.add(toolkitDir);
        directories.addAll(sectionPath);
        directories.add(currentDir);
        return filenameToParagraphs(directories, name);
    }


    public List<Paragraph> addHeader(String name) throws IOException {
        List<Paragraph> ps = filenameToParagraphs(name);

        // split this list of paragraphs into two parts
        List<Paragraph> pref = new ArrayList<>();
        List<Paragraph> suff = new ArrayList<>(ps);
        while (!suff.isEmpty() && !(suff.get(0) instanceof SectionHeader)) {
            pref.add(suff.get(0));
            suff.remove(0);
        }

        //String tname = FilenameUtils.removeExtension(name);
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


    public Set<Section> readSpec(Set<String> names, Set<Section> sections) throws IOException {
        Set<Section> ss = new HashSet<>();
        if (sections != null)
            ss.addAll(sections);
        if (names.isEmpty())
            return ss;

        /*

        else
            ss2  = union of all filenameTosections for the names
            size of ss2 == size of (sectionToName(ss2))
            return readSpec( sectionsToParents(ss2) minus sectionToName(sections)
            minus names,
               sections union ss2
         */
        Set<Section> ss2 = new HashSet<>();
        for (String n : names) {
            Set<Section> f2s = new HashSet<>(filenameToSections(n));
            ss2.addAll(f2s);
        }

        //prepare first param
        List<String> snames = ss.stream().map(s->sectionToName(s)).collect(Collectors.toList());
        Set<String> firstParam = sectionsToParents(ss2);
        firstParam.removeAll(snames);
        firstParam.removeAll(names);

        //second param
        ss2.addAll(ss);

        return readSpec(firstParam, ss2);
    }




    public class SectionListener extends SectionParserBaseListener {

        public List<Paragraph> paragraphs = new ArrayList<>();
        public List<String> formals = new ArrayList<>();

        @Override
        public void exitFormals(SectionParser.FormalsContext ctx) {
            formals.clear();
            for (TerminalNode t : ctx.NAME()) {
                formals.add(t.getText());
            }
        }

        @Override
        public void exitInformal(SectionParser.InformalContext ctx) {
            Paragraph p = new Informal(ctx.getText());
            paragraphs.add(p);
        }

        @Override
        public void exitZedParagraph(SectionParser.ZedParagraphContext ctx) {
            Paragraph p = new Formal(ctx.getText());
            paragraphs.add(p);
        }

        @Override
        public void exitSchemaParagraph(SectionParser.SchemaParagraphContext ctx) {
            Paragraph p = new Formal(ctx.getText());
            paragraphs.add(p);
        }

        @Override
        public void exitSectionHeader(SectionParser.SectionHeaderContext ctx) {
            SectionHeader s = new SectionHeader();
            s.setSectionName(ctx.NAME().getText());
            s.getParents().addAll(formals);
            paragraphs.add(s);
        }

    }
}
