package org.optionmetrics.zmd.core.translate;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.optionmetrics.zmd.core.translate.impl.Formal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TranslatorTests {

    @Rule
    public final TemporaryFolder tempFolder = new TemporaryFolder();

    private void copyFile(String name) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/" + name);
        Path dest = Paths.get(tempFolder.getRoot().getPath(), name);
        Files.copy(inputStream, dest);
    }

    @Test
    public void basicTest() throws Exception {

        copyFile("function_toolkit.z");
        copyFile("number_toolkit.z");
        copyFile("prelude.z");
        copyFile("relation_toolkit.z");
        copyFile("sequence_toolkit.z");
        copyFile("set_toolkit.z");
        copyFile("standard_toolkit.z");
        copyFile("zpptest.z");

        Path toolKitDir = Paths.get(tempFolder.getRoot().getPath());

        Environment environment = new Environment(toolKitDir);
        SectionProcessor sectionProcessor = new SectionProcessor(environment);

        sectionProcessor.process("zpptest");
        for (Section s : sectionProcessor.getSections()) {
            //System.out.println("Name: " + s.getName());
            for (Paragraph p : s.getParagraphs()) {
                if (p instanceof Formal) {
                    System.out.println( ((Formal) p).getExpanded());
                }
            }
            //System.out.println("------");
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
