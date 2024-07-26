package com.example.demo.Problema5;

public abstract class RoomDecorator implements Room {
    protected Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public void takeOrder() {
        room.takeOrder();
    }

    @Override
    public String describe() {
        return room.describe();
    }

    @Override
    public int calculatePrice() {
        return room.calculatePrice();
    }
}