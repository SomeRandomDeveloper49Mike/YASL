package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdCOPY  extends Command {
    public CmdCOPY() {
        super(0, "COPY");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Buffer = Stack.GetValue(Stack.Last());
    }
}