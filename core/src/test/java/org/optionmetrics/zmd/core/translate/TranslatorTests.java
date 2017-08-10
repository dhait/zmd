package org.optionmetrics.zmd.core.translate;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;
import org.optionmetrics.zmd.core.translate.impl.Formal;

public class TranslatorTests {


    @Test
    public void basicTest() throws Exception {

        SearchPath searchPath = new SearchPath();
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "/toolkit");
        searchPath.addItem(SearchPath.SourceType.RESOURCE_PATH, "");

        SectionProcessor sectionProcessor = new SectionProcessor(searchPath);

        sectionProcessor.process("zpptest");
        for (Section s : sectionProcessor.getSections()) {
            for (Paragraph p : s.getParagraphs()) {
                if (p instanceof Formal) {
                    System.out.println( ((Formal) p).getExpanded());
                }
            }
        }

    }
    @Test
    public void parseTest() {
        String input = "section testme end\n" +
                "\n" +
                "axiom [X] x in X implies x in X end\n" +
                "zed\n" +
                "  forall x : X @ x > 3\n" +
                "end\n";

        CharStream stream = CharStreams.fromString(input);
        TranslateLexer lexer = new TranslateLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //for (Token t : lexer.getAllTokens()) {
        //    System.out.println(t);
        //}

        TranslateParser parser = new TranslateParser(tokens);
        ParserRuleContext tree = parser.specification();
    }
}
