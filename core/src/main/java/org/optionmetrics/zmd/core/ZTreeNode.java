package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.commonmark.node.CustomNode;

public class ZTreeNode extends CustomNode {

    ParserRuleContext root;

    public ZTreeNode(ParserRuleContext tree) {
        root = tree;
    }
}
