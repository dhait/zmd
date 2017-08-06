package org.optionmetrics.zmd.core.section;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
}
