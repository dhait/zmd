package org.optionmetrics.zmd.core;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CompilerTests {

    @Test
    public void basicTest() throws Exception {

        Reader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + "simpleText.md")));

        Compiler compiler = new Compiler();
        String result = compiler.process(reader);
        System.out.println(result);
    }
}
