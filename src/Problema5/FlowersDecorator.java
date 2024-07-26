package com.example.demo.Problema5;

public class FlowersDecorator extends RoomDecorator {
    public FlowersDecorator(Room room) {
        super(room);
    }
    
    @Override
    public void takeOrder() {
        room.takeOrder();
        System.out.println("Adding flowers to the order");
    }

    @Override
    public String describe() {
        return room.describe() + ", Flowers";
    }

    @Override
    public int calculatePrice() {
        return room.calculatePrice() + 50;
    }
}