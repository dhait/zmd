package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

import java.io.IOException;
import java.io.Reader;

public class ZProcessor {

    public ParserRuleContext process(String zstring) {

        CharStream stream = CharStreams.fromString(zstring);
        ZLexer lexer = new ZLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZOperatorParser parser = new ZOperatorParser(tokens);
        ParserRuleContext tree = parser.specification();

        ParseTreeWalker walker = new ParseTreeWalker();
        ZOperatorListener ol = new ZOperatorListener();
        walker.walk(ol, tree);

        for (Token token : tokens.getTokens()) {
            Integer mapping = ol.associations.get(token.getText());
            if (mapping != null) {
                ((WritableToken) token).setType(mapping);
            }
        }

        ZSupport.rightAssociativity = ol.rightAssociativity;
        //tokens.reset();
        ZParser parser2 = new ZParser(tokens);
        ParserRuleContext tree2 = parser2.specification();

        return tree2;
    }
}
