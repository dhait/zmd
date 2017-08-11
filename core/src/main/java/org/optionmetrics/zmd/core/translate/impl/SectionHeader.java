package org.optionmetrics.zmd.core.translate.impl;

import org.optionmetrics.zmd.core.translate.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class SectionHeader extends Paragraph {

    private final String ZED = "\u2500";
    private final String END = "\u2514";

    private String sectionName;
    private List<String> parents = new ArrayList<>();
    private String expanded;
    private final String text;

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

    public String getExpanded() {
        return expanded;
    }

    public List<String> getParents() {
        return parents;
    }

    public void convertToZed() {
        expanded = text.replace("zed", ZED)
                .replace("end", END);

    }

    @Override
    public String toString() {
        return "SectionHeader(" + sectionName + ")";
    }
}
