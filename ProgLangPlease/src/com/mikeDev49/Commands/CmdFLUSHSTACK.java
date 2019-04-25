package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;
import com.mikeDev49.Value;

import java.util.List;

public class CmdFLUSHSTACK extends Command {

    public CmdFLUSHSTACK() {
        super(0, "FLUSHSTACK");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        for (Value val : Stack.GetStack()) {
            System.out.print(val.value);
        }
    }
}
