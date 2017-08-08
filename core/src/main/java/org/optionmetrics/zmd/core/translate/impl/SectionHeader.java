package org.optionmetrics.zmd.core.translate.impl;

import org.optionmetrics.zmd.core.translate.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class SectionHeader implements Paragraph {

    private String sectionName;
    private List<String> parents = new ArrayList<>();

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
        return "SectionHeader(" + sectionName + ")";
    }
}
