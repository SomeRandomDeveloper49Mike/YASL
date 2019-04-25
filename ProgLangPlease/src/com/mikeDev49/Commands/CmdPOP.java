package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdPOP extends Command {
    public CmdPOP() {
        super(0, "POP");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Remove(Stack.Last());
    }
}
