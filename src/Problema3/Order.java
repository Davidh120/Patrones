package com.example.demo.Problema3;

import java.util.Random;

// Template class
public abstract class Order {

    public int executeOrder() {
        takeOrder();

        if (checkAvailability()) {
            prepareOrder();

            return calculatePrice();
        }

        return 0;
    }
    
    abstract void takeOrder();

    boolean checkAvailability() {
        boolean availability = new Random().nextBoolean();
        System.out.println("Validando disponibilidad: " + availability);

        return availability;
    }

    abstract void prepareOrder();
    abstract int calculatePrice();
}
