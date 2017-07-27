package org.optionmetrics.zmd.core;

import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Code;
import org.commonmark.node.FencedCodeBlock;

public class CodeBlockVisitor extends AbstractVisitor {

    @Override
    public void visit(FencedCodeBlock code) {
        System.out.println("Info: " + code.getInfo());
        String text = code.getLiteral();
        System.out.println(text);
        visitChildren(code);
    }
}
