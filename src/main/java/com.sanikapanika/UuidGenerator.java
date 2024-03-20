package com.sanikapanika;

import org.apache.commons.cli.*;

import java.util.UUID;

public class UuidGenerator {

    public static String help = "Examples: \nuuid\nuuid -n4 or uuid --number=4\nuuid -n2 -nd or uuid -n2 --no-dashes\nuuid -n5 -nd -c=l or uuid -n=5 -nd --case=l";

    public static void main(String[] args) {
        Options options = new Options();
        options.addOption("n", "number",true, "Number of uuids to generate");
        options.addOption("nd", "no-dashes", false, "Omit dashes from output");
        options.addOption("c", "case", true, "Letter case (uppercase=u | lowercase=l)");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            UuidGenerator.exitProcedure("Error parsing command line arguments: " + e.getMessage());
        }

        @SuppressWarnings("ConstantConditions")
        int number = Integer.parseInt(cmd.getOptionValue("n", "1"));
        boolean noDash = cmd.hasOption("nd");
        String letterCase = cmd.getOptionValue("c", "l");
        if (!letterCase.equals("l") && !letterCase.equals("u")) {
            UuidGenerator.exitProcedure("Argument (-c | --case) must be either u (uppercase) or l (lowercase)");
        }

        if (number < 2) {
            String uuid = UUID.randomUUID().toString();
            if (noDash) {
                uuid = uuid.replace("-", "");
            }
            System.out.println(letterCase.equals("l") ? uuid.toLowerCase() : uuid.toUpperCase());
        } else {
            for (int i = 1; i <= number; i++) {
                String uuid = UUID.randomUUID().toString();
                if (noDash) {
                    uuid = uuid.replace("-", "");
                }
                System.out.println(letterCase.equals("l") ? uuid.toLowerCase() : uuid.toUpperCase());
            }
        }
    }

    private static void exitProcedure(String message) {
        System.err.println(message + "\n");
        System.out.println(help);
        System.exit(1);
    }
}
