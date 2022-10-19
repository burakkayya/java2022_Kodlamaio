package com.company;

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(), new DatabaseLogger(), new FileLogger(),new ConsoleLogger()};
//        for (BaseLogger logger : loggers)
//        {
//        logger.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}
