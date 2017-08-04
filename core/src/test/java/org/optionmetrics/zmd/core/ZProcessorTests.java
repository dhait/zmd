package org.optionmetrics.zmd.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ZProcessorTests {

    @Test
    public void processSimple() throws URISyntaxException, IOException {
        Path path = Paths.get(getClass()
                .getClassLoader()
                .getResource("scheduler.z").toURI());

        StringBuilder data = new StringBuilder();
        Stream<String> lines = Files.lines(path);
        lines.forEach(line -> data.append(line).append("\n"));
        lines.close();
        ZTranslator translator = new ZTranslator();
        String out = translator.translate(data.toString());
        System.out.println(out);

        ZProcessor processor = new ZProcessor();
        ParserRuleContext tree = processor.process(out);
        System.out.println("Done");
    }
}
