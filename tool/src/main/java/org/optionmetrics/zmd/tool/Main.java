package org.optionmetrics.zmd.tool;

import org.optionmetrics.zmd.core.Compiler;
import org.apache.commons.cli.*;

import java.io.*;

public class Main {

    Compiler compiler = new Compiler();

    public static void main(String [] args) throws IOException {

        Arguments arguments = new Arguments(args);

        arguments.parse();

    }
}
