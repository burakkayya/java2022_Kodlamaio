package com.company;

public class FileLogger extends BaseLogger {
    void log(String message) {
        System.out.println("Logged to File : " + message);
    }
}
