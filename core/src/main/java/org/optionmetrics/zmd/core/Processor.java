package org.optionmetrics.zmd.core;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.NodeRenderer;
import org.commonmark.renderer.html.HtmlNodeRendererContext;
import org.commonmark.renderer.html.HtmlNodeRendererFactory;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.IOException;
import java.io.Reader;

public class Processor {

    public void process(Reader reader) throws IOException {
        Parser parser = Parser.builder().build();
        Node document = parser.parseReader(reader);

        CodeBlockVisitor visitor = new CodeBlockVisitor();

        //document.accept(visitor);

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new ZCodeBlockRenderer(context))
                .build();

        System.out.println(renderer.render(document));
    }
}
