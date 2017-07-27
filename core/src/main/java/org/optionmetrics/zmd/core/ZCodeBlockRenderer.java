package org.optionmetrics.zmd.core;

import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Node;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.html.CoreHtmlNodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlWriter;

import javax.swing.text.html.HTMLWriter;
import java.util.Set;
import java.util.Collections;

import static java.util.Collections.singleton;

public class ZCodeBlockRenderer extends CoreHtmlNodeRenderer {

    public ZCodeBlockRenderer(HtmlNodeRendererContext context) {
        super(context);
    }

    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return singleton(FencedCodeBlock.class);
    }

    @Override
    public void render(Node node) {
        FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
        String language = fencedCodeBlock.getInfo();
        if (language != null) {
            language = language.substring(0, language.indexOf(' '));
        }
        if (language.toUpperCase().equals("Z") || language.toUpperCase().equals("ZED")) {
            HtmlWriter html = context.getWriter();
            html.line();
            html.tag("p");
            html.text(fencedCodeBlock.getLiteral());
            html.tag("/p");
            html.line();
        }
        else {
            super.render(node);
        }
    }
}
