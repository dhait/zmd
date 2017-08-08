package org.optionmetrics.zmd.core.translate.impl;

import org.optionmetrics.zmd.core.translate.Paragraph;

public class Definition implements Paragraph {
    private String key;
    private String value;


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
}
