package com.mikeDev49.Commands;

import com.mikeDev49.Command;

import java.util.List;

public class CmdEXIT extends Command {

    public CmdEXIT() {
        super(0, "EXIT");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        System.exit(0);
    }
}
