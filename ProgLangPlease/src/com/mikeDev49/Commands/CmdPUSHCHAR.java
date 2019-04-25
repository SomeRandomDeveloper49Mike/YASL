package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;
import com.mikeDev49.Value;

import java.util.List;

public class CmdPUSHCHAR extends Command {

    public CmdPUSHCHAR() {
        super(1, "PUSHCHAR");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Add(new Value((char)(int)args.get(0)));
    }
}
