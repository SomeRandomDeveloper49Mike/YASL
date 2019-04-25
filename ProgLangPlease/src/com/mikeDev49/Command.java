package com.mikeDev49;

import java.util.List;

public class Command {
    public int numberOfArguments;
    public String name;

    public Command(int numberOfArguments, String name) {
        this.numberOfArguments = numberOfArguments;
        this.name = name;
    }

    public void Execute(List<Integer> args) {
        if (args.size() != numberOfArguments) {
            ErrorHandler.PrintError(
                    new Error(ErrorHandler.ErrorType.RUNTIME_ERROR,
                            "Invalid Number Of Arguments (Expected "
                                    + numberOfArguments + ", got " + args.size() + ")"));
            System.exit(1);
        }
    }
}
