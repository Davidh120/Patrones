package com.example.demo.Problema3;

import java.util.Random;

public class OrderFood extends Order {
    @Override
    void takeOrder() {
        System.out.println("Tomando orden de plato principal");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparando orden de plato principal");
    }

    @Override
    int calculatePrice() {
        int foodPrice = new Random().nextInt(10,200);
        System.out.println("Precio de plato principal " + foodPrice);

        return foodPrice;
    }
}
