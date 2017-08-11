package org.optionmetrics.zmd.core.translate;

public abstract class Paragraph {

    private final String fileName;
    private int tagId;

    public Paragraph(String fileName, int tagId) {
        this.fileName = fileName;
        this.tagId = tagId;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract String toString();

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
