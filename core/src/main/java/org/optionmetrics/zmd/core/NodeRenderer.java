package org.optionmetrics.zmd.core;

import org.commonmark.node.CustomNode;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.CoreHtmlNodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;
import org.optionmetrics.zmd.core.parse.CodeParser;

import java.util.Set;

import static java.util.Collections.singleton;

public class NodeRenderer extends CoreHtmlNodeRenderer {

    private CodeParser parser = new CodeParser();

    public NodeRenderer(HtmlNodeRendererContext context) {
        super(context);
    }


    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return singleton(FencedCodeBlock.class);
    }

    public void zrender(ZTreeNode znode) {
        String code = znode.getCode();
        if (code != null) {
            String htmlText = parser.parse(code);

            HtmlWriter html = context.getWriter();
            html.line();
            html.raw(htmlText);
            html.line();
        }
    }


    @Override
    public void render(Node node) {
        FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
        ZInfo info = new ZInfo(fencedCodeBlock.getInfo());
        if (info.isZ()) {
            ZTreeNode znode = (ZTreeNode) fencedCodeBlock.getFirstChild();
            zrender(znode);
        }
        else {
            super.render(node);
        }
    }
}
