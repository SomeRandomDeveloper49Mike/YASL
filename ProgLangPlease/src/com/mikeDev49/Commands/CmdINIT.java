package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdINIT extends Command {
    public CmdINIT() {
        super(0, "INIT");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Initialize();
    }
}
