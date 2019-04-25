package com.mikeDev49;

import java.util.ArrayList;
import java.util.List;

public class Lexer extends  Debugger {
    class CommandArgPair {
        public String name;
        public List<Integer> args;

        public CommandArgPair(String name, List<Integer> args) {
            this.name = name;
            this.args = args;
        }
    }

    List<CommandArgPair> pairs;


    public void Analyze(String text) {
        debug("\nLEXER:");
        String[] lines = text.split("\n");
        List<CommandArgPair> pairs = new ArrayList<>();
        lineloop:
        for (String line : lines) {

            boolean none_token = false;
            String currentCommandName = "";
            List<Integer> args = new ArrayList<>();

            for (String token : line.split(" ")) {
                debug("TOKEN: " + token);
                debug("COMMAND: " + currentCommandName);
                debug("ARGS: " + args);
                token = token.replaceAll(" ", "");
                token = token.toLowerCase();
                if (token.equals("")) {
                    debug("NONE TOKEN");
                    debug("-------------");
                    none_token = true;
                    continue;
//                } else if (token.equals("|")) {
//                    debug("-------------");
//                    continue lineloop;             TODO: Comments!
                } else if (token.matches("[a-zA-Z]+")) {
                    currentCommandName = token;
                    debug("COMMAND: " + currentCommandName);
                    debug("-------------");
                    continue;
                } else if (token.matches("(-)?[0-9]+")) {
                    if (currentCommandName.equals("")) {
                        ErrorHandler.PrintError(
                                new Error(ErrorHandler.ErrorType.COMPILE_ERROR, "Unexpected Token")
                        );
                        System.exit(1);
                        continue;
                    } else {
                        debug("ARG");
                        args.add(Integer.parseInt(token));
                        debug("ARGS: " + args);
                        debug("-------------");
                        continue;
                    }

                } else {
                    debug("OTHER?!?!?!");
                    System.exit(1);
                }
            }
            if (!none_token) {
                debug("PAIR DATA:");
                pairs.add(new CommandArgPair(currentCommandName.toUpperCase(), List.copyOf(args)));
                debug("PAIR: " + pairs.get(pairs.size() - 1).name + ", " + pairs.get(pairs.size() - 1).args);
                currentCommandName = "";
                args.clear();
                debug("PAIR: " + pairs.get(pairs.size() - 1).name + ", " + pairs.get(pairs.size() - 1).args);
                debug("-------------");
                none_token = false;
            }

        }
        this.pairs = pairs;
    }
}
