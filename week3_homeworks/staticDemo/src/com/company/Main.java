package com.company;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "";
        product.price = 10;
        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
    }
}
