package org.optionmetrics.zmd.core;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.*;
import java.nio.file.Files;

public class Compiler {

    public void process(Reader reader) throws IOException {

        Parser parser = Parser.builder()
                .build();

        Node document = parser.parseReader(reader);

        File tmpFile = File.createTempFile("zmd_", ".z");
        tmpFile.deleteOnExit();
        System.out.println(tmpFile.getName());

        FileWriter writer = new FileWriter(tmpFile.toString(),true);
        BufferedWriter bw = new BufferedWriter(writer);
        TranslateVisitor translateVisitor = new TranslateVisitor(bw);
        document.accept(translateVisitor);
        bw.close();

        Files.lines(tmpFile.toPath()).forEach(System.out::println);

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new NodeRenderer(context))
                .build();

        System.out.println(renderer.render(document));
    }
}
