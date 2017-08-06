package org.optionmetrics.zmd.core.section;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.optionmetrics.zmd.core.ZMarkup;
import org.optionmetrics.zmd.core.ZMarkupLexer;
import org.optionmetrics.zmd.core.ZMarkupListenerImpl;
import org.optionmetrics.zmd.core.zpp.ZPreProcessor;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Collections.singleton;

public class SectionProcessorTests {

    @Rule
    public final TemporaryFolder tempFolder = new TemporaryFolder();

    private void copyFile(String name) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream("/" + name);
        Path dest = Paths.get(tempFolder.getRoot().getPath(), name);
        Files.copy(inputStream, dest);
    }

    @Test
    public void basicTest() throws Exception {

        copyFile("prelude.z");
        copyFile("sequence_toolkit.z");
        copyFile("set_toolkit.z");
        copyFile("standard_toolkit.z");
        copyFile("zpptest.z");

        Path toolKitDir = Paths.get(tempFolder.getRoot().getPath());
        SectionProcessor sectionProcessor = new SectionProcessor(toolKitDir);

        List<Section> sections = sectionProcessor.sortSections("zpptest");
        for (Section s : sections)
            System.out.println(s);
    }

    @Test
    public void parseTest() {
        String input = "section testme end\n" +
                "\n" +
                "zed\n" +
                "  forall x : X @ x > 3\n" +
                "end\n";

        CharStream stream = CharStreams.fromString(input);
        SectionLexer lexer = new SectionLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SectionParser parser = new SectionParser(tokens);
        ParserRuleContext tree = parser.specification();

    }
}
