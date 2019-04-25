package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdPASTE extends Command {
    public CmdPASTE() {
        super(0, "PASTE");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Add(Stack.Buffer);
    }
}