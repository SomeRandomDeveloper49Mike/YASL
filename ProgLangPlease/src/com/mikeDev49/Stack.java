package com.mikeDev49;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Initializable {
    private static List<Value> stack;
    public static Value Buffer;

    public static void Initialize() {
        stack = new ArrayList<>();
    }

    public static Value GetValue(int index) {
        return stack.get(index);
    }

    public static void Set(int index, Value value) {
        stack.set(index, value);
    }

    public static void Add(Value value) {
        stack.add(value);
    }

    public static void Remove(Value value) {
        stack.remove(value);
    }

    public static void Remove(int index) {
        stack.remove(index);
    }

    public static int Last() {
        return stack.size() - 1;
    }

    public static List<Value> GetStack() {
        return stack;
    }
}
