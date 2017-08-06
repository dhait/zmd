package org.optionmetrics.zmd.core.section;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Section {
    private List<Paragraph> paragraphs = new ArrayList<>();

    private boolean tempMark = false;
    private boolean permMark = false;

    public boolean isUnmarked() {
        return  !tempMark && !permMark;
    }

    public String toName() {
        return ((SectionHeader) paragraphs.get(0)).getSectionName();
    }

    public List<String> getParents() {
        return ((SectionHeader) paragraphs.get(0)).getParents();
    }

    public void expandDefinitions(Map<String, String> defines) {
        for (Paragraph p : paragraphs) {
            if (p instanceof Formal) {
                // make the substitutions
            }
        }
    }
}
