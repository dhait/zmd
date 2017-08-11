package org.optionmetrics.zmd.core;

import org.apache.commons.lang3.StringUtils;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.optionmetrics.zmd.core.translate.Paragraph;
import org.optionmetrics.zmd.core.translate.SearchPath;
import org.optionmetrics.zmd.core.translate.Section;
import org.optionmetrics.zmd.core.translate.SectionProcessor;
import org.optionmetrics.zmd.core.translate.impl.Formal;

import java.io.*;
import java.nio.file.Files;

public class Compiler {

    public void process(Reader reader) throws Exception {

        Parser parser = Parser.builder()
                .build();

        Node document = parser.parseReader(reader);

        File tmpFile = File.createTempFile("zmd_", ".z");
        tmpFile.deleteOnExit();

        FileWriter writer = new FileWriter(tmpFile.toString(),true);
        BufferedWriter bw = new BufferedWriter(writer);
        TranslateVisitor translateVisitor = new TranslateVisitor(bw);
        document.accept(translateVisitor);
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(tmpFile.toString()));
        br.lines().forEach(l->System.out.println(l));
        br.close();

        // now we parse the file
        SearchPath searchPath = new SearchPath();
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "");
        searchPath.addItem(SearchPath.SourceType.DIRECTORY, tmpFile.getParent());

        SectionProcessor sectionProcessor = new SectionProcessor(searchPath);

        sectionProcessor.process(StringUtils.removeEnd(tmpFile.getName(), ".z"));

        // now the paragraphs have been translated
        for (Section s : sectionProcessor.getSections()) {
            for (Paragraph p : s.getParagraphs()) {
                if (p instanceof Formal) {
                    System.out.println( ((Formal) p).getExpanded());
                }
            }
        }

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new NodeRenderer(context))
                .build();

        // TODO return string
        System.out.println(renderer.render(document));
    }
}
