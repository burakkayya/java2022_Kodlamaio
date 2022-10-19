package com.company;

public class CustomerManager {
    private BaseLogger logger;

    CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");
    }
}
