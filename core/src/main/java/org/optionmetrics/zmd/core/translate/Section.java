package org.optionmetrics.zmd.core.translate;

import org.apache.commons.text.StringEscapeUtils;
import org.optionmetrics.zmd.core.translate.impl.Definition;
import org.optionmetrics.zmd.core.translate.impl.Formal;
import org.optionmetrics.zmd.core.translate.impl.SectionHeader;

import java.text.Normalizer;
import java.util.*;


public class Section {

    private List<Paragraph> paragraphs = new ArrayList<>();
    private Map<String, String> definitions = new HashMap<>();

        enum Mark {
        NONE,
        TEMP,
        PERM
    }
    public Mark mark = Mark.NONE;

    public String getName() {
        return getSectionHeader().getSectionName();
    }

    private SectionHeader getSectionHeader() {
        return (SectionHeader) paragraphs.get(0);
    }

    public Map<String, String> getDefinitions() {
            return definitions;
    }
    public List<String> getParents() {
        return (getSectionHeader()).getParents();
    }

    void visit(Set<Section> sections, List<Section> sorted) throws Exception {
        if (mark == Mark.PERM)
            return;
        if (mark == Mark.TEMP) {
            throw new Exception("Cycle present");
        }
        mark = Mark.TEMP;
        List<String> parents = getParents();
        for (String p : parents) {
            Optional<Section> ps = sections.stream()
                    .filter(s->s.getName().equals(p)).findFirst();
            if (ps.isPresent())
                ps.get().visit(sections, sorted);
        }
        mark = Mark.PERM;
        sorted.add(this);
    }


    public void collectDefinitions() {
        for (Paragraph p : paragraphs) {
            if (p instanceof Definition) {
                String key = ((Definition) p).getKey();
                String value = StringEscapeUtils.unescapeJava(((Definition) p).getValue());
                definitions.put(key,value);
            }
        }
    }
    public void expandDefinitions(Map<String, String> defines) {
        for (Paragraph p : paragraphs) {
            if (p instanceof Formal) {
                // make the substitutions
                Formal f = (Formal) p;
                f.expand(defines);
            }
        }
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    @Override
    public String toString() {

        return getName();

    }

    public void convertToZed() {
        for (Paragraph p : paragraphs) {
            if (p instanceof Formal) {
                Formal f = (Formal) p;
                f.convertToZed();
            }
            else if (p instanceof SectionHeader) {
                SectionHeader h = (SectionHeader) p;
                h.convertToZed();
            }
        }
    }
}
