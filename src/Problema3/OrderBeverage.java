package com.example.demo.Problema3;

import java.util.Random;

public class OrderBeverage extends Order{
    @Override
    void takeOrder() {
        System.out.println("Tomando orden de bebidas");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando orden de bebidas");
    }

    @Override
    int calculatePrice() {
        int beveragePrice = new Random().nextInt(10,200);
        System.out.println("Precio de bebidas " + beveragePrice);

        return beveragePrice;
    }
}
