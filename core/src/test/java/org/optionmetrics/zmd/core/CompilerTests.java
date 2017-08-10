package org.optionmetrics.zmd.core;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CompilerTests {

    @Test
    public void basicTest() throws IOException {

        Reader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + "simpleText.md")));

        Compiler processor = new Compiler();
        processor.process(reader);

    }
}
