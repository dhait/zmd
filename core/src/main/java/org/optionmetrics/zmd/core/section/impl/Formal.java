package org.optionmetrics.zmd.core.section.impl;


import org.optionmetrics.zmd.core.section.Paragraph;

import java.util.Map;

public class Formal extends Paragraph {

    private final String text;
    private String expanded;

    public Formal(String text, String fileName, int tag) {
        super(fileName,tag);
        this.text = text;
    }

    @Override
    public String toString() {
        return "Formal(" + text + ")";
    }

    public String getExpanded() {
        return expanded;
    }

    public void expand(Map<String, String> defines) {
        String temp = text;
        for (String k : defines.keySet()) {
            temp = temp.replace(k, defines.get(k));
        }
        expanded = temp;
    }
}
