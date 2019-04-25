package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdPOPSTACK extends Command {
    public CmdPOPSTACK() {
        super(0, "POPSTACK");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.GetStack().clear();
    }
}
