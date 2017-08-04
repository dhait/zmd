package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

import java.util.List;

public class ZLexerTests {

    @Test
    public void basicTest() {
        String input = "\u2500 relation ( singleton _ )";
        CharStream stream = CharStreams.fromString(input);
        ZLexer lexer = new ZLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        System.out.println("Deon");
    }
}
