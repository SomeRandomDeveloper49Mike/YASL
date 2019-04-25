package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Stack;

import java.util.List;

public class CmdCLEARBUFFER extends Command {
    public CmdCLEARBUFFER() {
        super(0, "POPBUFFER");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        Stack.Buffer = null;
    }
}