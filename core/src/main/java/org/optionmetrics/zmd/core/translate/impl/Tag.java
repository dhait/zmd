package org.optionmetrics.zmd.core.translate.impl;

import org.optionmetrics.zmd.core.translate.Paragraph;

public class Tag extends Paragraph {
    private int tagId;

    public Tag(int tagId, String fileName) {
        super(fileName);
        this.tagId = tagId;
    }

    public int getTagId() {
        return tagId;
    }

    @Override
    public String toString() {
        return "Tag " + String.valueOf(tagId);
    }
}
