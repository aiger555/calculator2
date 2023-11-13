package com.example.javafx2;


public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Division by zero is not allowed.");
    }
}
