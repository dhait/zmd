package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.commonmark.node.CustomNode;

public class ZTreeNode extends CustomNode {

    private int sequence = 0;

    public ZTreeNode(int seq) {
        this.sequence = seq;
    }

    public int getSequence() {
        return sequence;
    }
}
