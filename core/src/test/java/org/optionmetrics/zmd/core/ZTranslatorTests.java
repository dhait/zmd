package org.optionmetrics.zmd.core;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZTranslatorTests {

    @Test
    public void basicTest() throws URISyntaxException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + "scheduler.z")));


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
    }
}
