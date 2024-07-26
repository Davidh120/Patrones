package com.example.demo.Problema5;

public class ChocoDecorator extends RoomDecorator {
    public ChocoDecorator(Room room) {
        super(room);
    }

    @Override
    public void takeOrder() {
        room.takeOrder();
        System.out.println("Adding chocolate to the order");
    }

    @Override
    public String describe() {
        return room.describe() + ", chocolate";
    }

    @Override
    public int calculatePrice() {
        return room.calculatePrice() + 10;
    }
}