package com.mikeDev49;

public class Error {
    public ErrorHandler.ErrorType type;
    public String message;


    public Error(ErrorHandler.ErrorType type, String message) {
        this.type = type;
        this.message = message;
    }
}
