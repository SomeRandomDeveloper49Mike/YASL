package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;
import com.mikeDev49.Value;

import java.util.List;

public class CmdFLUSH extends Command {

    public CmdFLUSH() {
        super(0, "FLUSH");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        System.out.print(Stack.GetValue(Stack.Last()).value);
    }
}

