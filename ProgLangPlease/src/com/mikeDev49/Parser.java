package com.mikeDev49;

import java.util.ArrayList;
import java.util.List;

public class Parser extends Debugger {
    public List<Command> commands = new ArrayList<>();


    public boolean isValidCommand(String name, int args) {
        for (Command command : commands) {
            if (command.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Command getCommand(String name) {
        for (Command command : commands) {
            if (command.name.equals(name)) {
                return command;
            }
        }
        return null;
    }

    public void Parse(List<Lexer.CommandArgPair> pairs) {
        debug("\n\nPARSER:");

        for (Lexer.CommandArgPair pair : pairs) {
            debug("PAIR: " + pair.name + ", " + pair.args);
            boolean isValid = isValidCommand(pair.name, pair.args.size());
            if (!isValid) {
                ErrorHandler.PrintError(
                        new Error(ErrorHandler.ErrorType.COMPILE_ERROR,
                                "Unknown Command: " + pair.name));
            } else {
                Command c = getCommand(pair.name);
                debug("\nEXECUTION:");
                c.Execute(pair.args);
            }
        }
    }
}
