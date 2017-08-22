package org.optionmetrics.zmd.core.section.impl;

import org.optionmetrics.zmd.core.section.Paragraph;

public class Definition extends Paragraph {
    private String key;
    private String value;

    public Definition(String fileName, int tag) {
        super(fileName, tag);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}
