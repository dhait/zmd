package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.misc.MultiMap;
import org.apache.commons.lang3.StringUtils;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.optionmetrics.zmd.core.translate.Paragraph;
import org.optionmetrics.zmd.core.translate.SearchPath;
import org.optionmetrics.zmd.core.translate.Section;
import org.optionmetrics.zmd.core.translate.SectionProcessor;
import org.optionmetrics.zmd.core.translate.impl.Formal;
import org.optionmetrics.zmd.core.translate.impl.SectionHeader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Reader;

public class Compiler {

    private String result;

    public String getResult() {
        return result;
    }

    public String process(Reader reader) throws Exception {


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

        // now we parse the file
        SearchPath searchPath = new SearchPath();
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "");
        searchPath.addItem(SearchPath.SourceType.DIRECTORY, tmpFile.getParent());

        SectionProcessor sectionProcessor = new SectionProcessor(searchPath);
        sectionProcessor.process(StringUtils.removeEnd(tmpFile.getName(), ".z"));

        // now the paragraphs have been translated

        // extract tagged paragraphs
        MultiMap<Integer, String> blockMap = new MultiMap<>();
        for (Section s: sectionProcessor.getSections()) {
            for (Paragraph p : s.getParagraphs()) {
                if (p instanceof Formal) {
                    // also add rendering
                    blockMap.map(p.getTagId(), ((Formal)p).getExpanded());
                }
                else if (p instanceof SectionHeader) {
                    blockMap.map(p.getTagId(), ((SectionHeader) p).getExpanded());
                }
            }
        }

        ReplaceVisitor replaceVisitor = new ReplaceVisitor(blockMap);
        document.accept(replaceVisitor);

        HtmlRenderer renderer = HtmlRenderer.builder()
                .nodeRendererFactory(context -> new NodeRenderer(context))
                .build();

        result = renderer.render(document);
        return result;
    }
}
