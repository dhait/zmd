package org.optionmetrics.zmd.core.translate.impl;


import org.optionmetrics.zmd.core.translate.Paragraph;

public class Informal implements Paragraph {
    private final String text;
    public Informal(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "Informal(" + text + ")";
    }
}
