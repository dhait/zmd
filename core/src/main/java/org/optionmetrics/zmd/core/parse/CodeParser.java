package org.optionmetrics.zmd.core.parse;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.optionmetrics.zmd.core.RenderVisitor;

public class CodeParser {

    public String parse(String zcode) {
        CharStream stream = CharStreams.fromString(zcode);
        ZLexer lexer = new ZLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZOperatorParser parser = new ZOperatorParser(tokens);
        ParserRuleContext tree = parser.specification();
        // add file tag
        ParseTreeWalker walker = new ParseTreeWalker();
        RenderVisitor listener = new RenderVisitor();
        walker.walk(listener, tree);
        return listener.getHtml();
    }
}
