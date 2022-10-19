package com.company;

public class ConsoleLogger extends BaseLogger {
    void log(String message) {
        System.out.println("Logged to Console : " + message);
    }
}
