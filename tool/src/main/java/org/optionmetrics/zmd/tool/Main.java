package org.optionmetrics.zmd.tool;

import org.optionmetrics.zmd.core.Compiler;
import org.apache.commons.cli.*;

import java.io.*;

public class Main {

    Compiler compiler = new Compiler();

    public static void main(String [] args) throws Exception {

        Arguments arguments = new Arguments(args);

        arguments.parse();

        // TODO: Get input from command line

        Reader reader = new BufferedReader(new InputStreamReader(
                Main.class.getResourceAsStream("/" + "simpleText.md")));

        Compiler processor = new Compiler();
        String result = processor.process(reader);
        System.out.println(result);
    }
}
