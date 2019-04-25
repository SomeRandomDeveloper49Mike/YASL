package com.mikeDev49.Commands;

import com.mikeDev49.Command;
import com.mikeDev49.Error;
import com.mikeDev49.ErrorHandler;
import com.mikeDev49.Stack;
import com.mikeDev49.Value;

import java.util.List;

public class CmdADD extends Command {

    public CmdADD() {
        super(0, "ADD");
    }

    @Override
    public void Execute(List<Integer> args) {
        super.Execute(args);
        if (Stack.GetValue(Stack.Last()).value.getClass() ==
                Integer.class && Stack.GetValue(Stack.Last() - 1).value.getClass() == Integer.class) {
            Stack.Add(new Value((Integer)Stack.GetValue(Stack.Last()).value +
                    (Integer)Stack.GetValue(Stack.Last() - 1).value));
        } else {
            ErrorHandler.PrintError(new Error(ErrorHandler.ErrorType.RUNTIME_ERROR,
                    "Expected INT, but got " +
                            Stack.GetValue(Stack.Last()).type +
                            " and " +
                            Stack.GetValue(Stack.Last() - 1).type
            ));
        }
    }
}
