package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.misc.MultiMap;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.FencedCodeBlock;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceVisitor extends AbstractVisitor {

    private MultiMap<Integer,String> blockMap;

    public ReplaceVisitor(MultiMap<Integer, String> blockMap) {
        this.blockMap = blockMap;
    }
    @Override

    public void visit(FencedCodeBlock codeBlock) {
        ZInfo info = new ZInfo(codeBlock.getInfo());
        if (info.isZ()) {
            ZTreeNode znode = (ZTreeNode) codeBlock.getFirstChild();
            int tag = znode.getSequence();
            List<String> paragraphs =  blockMap.get(tag);
            if (paragraphs != null)
                znode.setCode(paragraphs.stream().collect(Collectors.joining()));
        }
    }

}
