package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.commonmark.node.CustomNode;

public class ZTreeNode extends CustomNode {

    private int sequence = 0;
    private String code;

    public ZTreeNode(int seq) {
        this.sequence = seq;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public int getSequence() {
        return sequence;
    }
}
