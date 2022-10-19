package com.company;

public class CustomerManager {
    private ICustomerDal customerDal;

    CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
