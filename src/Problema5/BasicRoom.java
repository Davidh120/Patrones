package com.example.demo.Problema5;

public class BasicRoom implements Room {
    @Override
    public void takeOrder() {
        System.out.println("Taking order for basic room");
    }

    @Override
    public String describe() {
        return "Basic Room";
    }

    @Override
    public int calculatePrice() {
        return 100;
    }

}