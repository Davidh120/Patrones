package com.example.demo.Problema5;

public class WineDecorator extends RoomDecorator {
    public WineDecorator(Room room) {
        super(room);
    }

    @Override
    public void takeOrder() {
        room.takeOrder();
        System.out.println("Taking order for wine");
    }

    @Override
    public String describe() {
        return room.describe() + ", wine";
    }

    @Override
    public int calculatePrice() {
        return room.calculatePrice() + 50;
    }
}