package com.company;

public class EmailLogger extends BaseLogger {
    void log(String message) {
        System.out.println("Logged to Email : " + message);
    }
}
