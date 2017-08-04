package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ZMarkupTests {


    @Test
    public void basicTest() throws URISyntaxException, IOException {

        Path path = Paths.get(getClass()
                .getClassLoader()
                .getResource("section.zed").toURI());

        StringBuilder data = new StringBuilder();
        Stream<String> lines = Files.lines(path);
        lines.forEach(line -> data.append(line).append("\n"));
        lines.close();
        String input = data.toString();

        CharStream stream = CharStreams.fromString(input);
        ZMarkupLexer lexer = new ZMarkupLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ZMarkup parser = new ZMarkup(tokens);
        ParserRuleContext tree = parser.specification();

        ParseTreeWalker walker = new ParseTreeWalker();
        ZMarkupListenerImpl ol = new ZMarkupListenerImpl();
        walker.walk(ol, tree);

        System.out.println(input);
    }
}
