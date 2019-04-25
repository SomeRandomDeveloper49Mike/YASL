package com.mikeDev49;

public class Debugger {
    public static boolean debug = false;

    void debug(Object o) {
        if (debug) System.out.println(o);
    }

    static void s_debug(Object o) {
        if (debug) System.out.println(o);
    }
}
