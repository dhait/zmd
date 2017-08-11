package org.optionmetrics.zmd.core.translate;

public abstract class Paragraph {

    private final String fileName;

    public Paragraph(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract String toString();
}
