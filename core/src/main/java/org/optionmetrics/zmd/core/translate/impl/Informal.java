package org.optionmetrics.zmd.core.translate.impl;


import org.optionmetrics.zmd.core.translate.Paragraph;

public class Informal extends Paragraph {
    private final String text;
    public Informal(String text, String fileName) {
        super(fileName);
        this.text = text;
    }
    @Override
    public String toString() {
        return "Informal(" + text + ")";
    }
}
