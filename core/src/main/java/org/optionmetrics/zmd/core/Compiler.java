package org.optionmetrics.zmd.core;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.IOException;
import java.io.Reader;

public class Compiler {

    public void process(Reader reader) throws IOException {

        Parser parser = Parser.builder()
                .postProcessor(new ZTranslator2())
                .build();

        Node document = parser.parseReader(reader);

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new NodeRenderer(context))
                .build();

        System.out.println(renderer.render(document));
    }
}
