package com.example.demo.Problema3;

public class Main {
    public static void main(String[] args) {
        int finalPrice = 0;

        Order foodOrder = new OrderFood();
        finalPrice = finalPrice + foodOrder.executeOrder();

        Order beverageOrder = new OrderBeverage();
        finalPrice = finalPrice + beverageOrder.executeOrder();

        Order dessertOrder = new OrderDessert();
        finalPrice = finalPrice + dessertOrder.executeOrder();

        System.out.println("El precio final de la orden es: " + finalPrice);
    }
}
