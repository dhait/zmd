package org.optionmetrics.zmd.core;

import org.commonmark.node.CustomNode;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.CoreHtmlNodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;

import java.util.Set;

import static java.util.Collections.singleton;

public class ZRenderer extends CoreHtmlNodeRenderer {

    public ZRenderer(HtmlNodeRendererContext context) {
        super(context);
    }

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return singleton(FencedCodeBlock.class);
    }

    @Override
    public void render(Node node) {
        FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
        ZInfo info = new ZInfo(fencedCodeBlock.getInfo());
        if (info.isZ()) {
            HtmlWriter html = context.getWriter();
            html.line();
            html.tag("p");
            html.raw(fencedCodeBlock.getLiteral());
            html.tag("/p");
            html.line();
        }
        else {
            super.render(node);
        }
    }
}
