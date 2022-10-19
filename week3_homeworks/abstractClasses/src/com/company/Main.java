package com.company;

public class Main {

    public static void main(String[] args) {

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();

        GameCalculator gameCalculator2 = new ManGameCalculator();
        gameCalculator2.hesapla();
        gameCalculator2.gameOver();
    }
}
