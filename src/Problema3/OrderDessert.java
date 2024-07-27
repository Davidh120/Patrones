package com.example.demo.Problema3;

import java.util.Random;

public class OrderDessert extends Order {
    @Override
    void takeOrder() {
        System.out.println("Tomando orden de postre");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando orden de postre");
    }

    @Override
    int calculatePrice() {
        int dessertPrice = new Random().nextInt(10,200);
        System.out.println("Precio de postre " + dessertPrice);

        return dessertPrice;
    }
}
