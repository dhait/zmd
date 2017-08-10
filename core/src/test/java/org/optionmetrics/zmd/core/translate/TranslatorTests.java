package org.optionmetrics.zmd.core.translate;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.optionmetrics.zmd.core.translate.impl.Formal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TranslatorTests {


    @Rule
    public TemporaryFolder tempfolder = new TemporaryFolder();

 private void copyToolkit(String name, File dest) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/" + dest.getName() +"/" + name);
        Files.copy(inputStream, dest.toPath().resolve(name));

    }

    @Test
    public void basicTest() throws Exception {

        File toolkit = tempfolder.newFolder("toolkit");
        copyToolkit("function_toolkit.z", toolkit);
        copyToolkit("number_toolkit.z", toolkit);
        copyToolkit("prelude.z", toolkit);
        copyToolkit("relation_toolkit.z", toolkit);
        copyToolkit("sequence_toolkit.z", toolkit);
        copyToolkit("set_toolkit.z", toolkit);
        copyToolkit("standard_toolkit.z", toolkit);

        Environment environment = new Environment(toolkit.toPath());

        InputStream inputStream = this.getClass().getResourceAsStream("/zpptest.z");
        Files.copy(inputStream, tempfolder.getRoot().toPath().resolve("zpptest.z"));

        environment.addToSectionPath(tempfolder.getRoot().toPath());

        SectionProcessor sectionProcessor = new SectionProcessor(environment);

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
