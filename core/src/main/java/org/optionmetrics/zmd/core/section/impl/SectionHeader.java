package org.optionmetrics.zmd.core.section.impl;

import org.optionmetrics.zmd.core.section.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class SectionHeader extends Paragraph {

    private String sectionName;
    private String text;
    private List<String> parents = new ArrayList<>();

    public SectionHeader(String text, String fileName, int tag) {
        super(fileName, tag);
        this.text = text;
    }

    public String getSectionName() {
        return sectionName;
    }
    public void setSectionName(String name) {
        this.sectionName = name;
    }

    public List<String> getParents() {
        return parents;
    }

    @Override
    public String toString() {
        return text;
    }
}
