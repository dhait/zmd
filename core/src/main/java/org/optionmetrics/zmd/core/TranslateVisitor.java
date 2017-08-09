package org.optionmetrics.zmd.core;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.FencedCodeBlock;


import java.io.IOException;
import java.io.Writer;

public class TranslateVisitor extends AbstractVisitor {

    private Writer writer;
    private int sequence = 0;

    public TranslateVisitor(Writer writer) {
        this.writer = writer;
    }
    @Override
    public void visit(FencedCodeBlock codeBlock) {
        ZInfo info = new ZInfo(codeBlock.getInfo());
        if (info.isZ()) {

            String zblock = codeBlock.getLiteral();
            try {
                writer.write("tag " + String.valueOf(sequence) + "\n");
                writer.write(zblock);
            } catch (IOException e) {
                e.printStackTrace();
            }
            codeBlock.appendChild(new ZTreeNode(sequence++));
        }
    }

}
