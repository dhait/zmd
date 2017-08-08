package org.optionmetrics.zmd.core.translate.impl;


import org.optionmetrics.zmd.core.translate.Paragraph;

import java.util.Map;

public class Formal implements Paragraph {

    private final String text;
    private final boolean generic;
    private String expanded;

    private final String AX = "\u2577";
    private final String SCH = "\u250c";
    private final String GEN = "\u2550";
    private final String ZED = "\u2500";
    private final String END = "\u2514";
    private final String VERT = "|";

    public Formal(String text, boolean generic) {
        this.text = text;
        this.generic = generic;
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

    public void convertToZed() {
        if (generic) {
            expanded = expanded.replace("zed", ZED)
                    .replace("axiom", AX+GEN)
                    .replace("schema", SCH+GEN)
                    .replace("where", VERT )
                    .replace("end", END);
        }
        expanded = expanded.replace("zed", ZED)
                .replace("axiom", AX)
                .replace("schema", SCH)
                .replace("where", VERT )
                .replace("end", END);

    }
}
