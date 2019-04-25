package com.mikeDev49;

public class ErrorHandler {
    public enum ErrorType {
        RUNTIME_ERROR,
        COMPILE_ERROR
    }



    public static void PrintError(Error error) {
        if (error.type == ErrorType.COMPILE_ERROR) {
            System.out.println("COMPILE ERROR: " + error.message);
        } else if (error.type == ErrorType.RUNTIME_ERROR) {
            System.out.println("RUNTIME ERROR: " + error.message);
        }
    }

}
