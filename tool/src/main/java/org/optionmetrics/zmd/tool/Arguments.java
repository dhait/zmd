/*
 * [The "BSD licence"]
 *  Copyright (c) 2017 David J Hait
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.optionmetrics.zmd.tool;

import org.apache.commons.cli.*;

public class Arguments {

    private final String[] args;
    private Options options = new Options();
    private String[] remaining;
    private CommandLine commandLine;


    public String[] getRemaining() {
        return remaining;
    }

    public CommandLine getCommandLine() {
        return commandLine;
    }

    public Arguments(String[] args) {

        this.args = args;
        Option help = Option.builder("h")
                .argName("help")
                .desc("Show help")
                .longOpt("help")
                .build();


        Option version = Option.builder("v")
                .argName("version")
                .desc("Print current version")
                .longOpt("version")
                .build();

        options.addOption(help);
        options.addOption(version);

    }

    public void parse() {
        CommandLineParser parser = new DefaultParser();
        try {
            commandLine = parser.parse(options, args);
            if (commandLine.hasOption("h"))
                help();
            if (commandLine.hasOption("v")) {
                String v = this.getClass().getPackage().getImplementationVersion();
                System.out.println("Version: " + v);
            }
        } catch (ParseException e) {
            System.err.println("Failed to parse comand line properties");
            help();
        }
        remaining = commandLine.getArgs();

    }

    private void help() {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("zmd [options] input ...", options);
    }

}
