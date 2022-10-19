package com.company;

public class DatabaseLogger extends BaseLogger {
    void log(String message) {
        System.out.println("Logged to Database : " + message);
    }
}
