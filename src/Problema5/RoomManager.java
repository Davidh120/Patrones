package com.example.demo.Problema5;

public class RoomManager {
    private Room room;

    public RoomManager(Room room) {
        this.room = room;
    }

    public void takeOrder() {
        room.takeOrder();
    }

    public String getRoomDescription() {
        return room.describe();
    }

    public int getRoomCost() {
        return room.calculatePrice();
    }

}