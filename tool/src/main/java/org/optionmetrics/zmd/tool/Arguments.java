package org.optionmetrics.zmd.tool;

import org.apache.commons.cli.*;

public class Arguments {

    private final String[] args;
    private Options options = new Options();


    public Arguments(String[] args) {

        this.args = args;
        options.addOption("h", "help", false, "show help.");
        Option version = Option.builder("v")
                .argName("version")
                .desc("Print current version")
                .longOpt("version")
                .build();

        options.addOption(version);

    }

    public void parse() {
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
            if (cmd.hasOption("h"))
                help();
            if (cmd.hasOption("v")) {
                String v = this.getClass().getPackage().getImplementationVersion();
                System.out.println("Version: " + v);
            }
        } catch (ParseException e) {
            System.err.println("Failed to parse comand line properties");
            help();
        }

    }

    private void help() {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("Main", options);
    }

}
