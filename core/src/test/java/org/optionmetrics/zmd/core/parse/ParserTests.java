package org.optionmetrics.zmd.core.parse;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;
import org.optionmetrics.zmd.core.translate.Paragraph;

public class ParserTests {


    @Test
    public void testParse() {


        String zcode = "╷ \n" +
                " mem_size : WORD \n" +
                " | \n" +
                " mem_size = 100 \n" +
                " └";
        CharStream stream = CharStreams.fromString(zcode);
        ZLexer lexer = new ZLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZOperatorParser parser = new ZOperatorParser(tokens);
        ParserRuleContext tree = parser.specification();
        System.out.println("Done");
    }
}
