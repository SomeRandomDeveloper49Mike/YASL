package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;
import com.mikeDev49.Value;

import java.util.List;

public class CmdPUSHINT extends Command {
    public CmdPUSHINT() {
        super(1, "PUSHINT");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Add(new Value(args.get(0)));
    }
}
