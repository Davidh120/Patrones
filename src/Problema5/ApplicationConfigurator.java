package com.example.demo.Problema5;

public class ApplicationConfigurator {

    public void configureRoom(boolean enableFlowers, boolean enableChocolate, boolean enableWine) {
        Room room = new BasicRoom();
        if (enableFlowers) {
            room = new FlowersDecorator(room);
        }
        if (enableChocolate) {
            room = new ChocoDecorator(room);
        }
        if (enableWine) {
            room = new WineDecorator(room);
        }
        RoomManager roomManager = new RoomManager(room);
        roomManager.takeOrder();
        System.out.println("Room description: " + roomManager.getRoomDescription());
        System.out.println("Room cost: " + roomManager.getRoomCost());
    }
}