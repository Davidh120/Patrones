package com.example.demo.Problema5;

public class Main {
    public static void main(String[] args) {
        // basic room
        ApplicationConfigurator basicConfigurator = new ApplicationConfigurator();
        basicConfigurator.configureRoom(false, false, false);

        // room with flowers
        ApplicationConfigurator flowersConfigurator = new ApplicationConfigurator();
        flowersConfigurator.configureRoom(true, false, false);

        // room with everything
        ApplicationConfigurator fullConfigurator = new ApplicationConfigurator();
        fullConfigurator.configureRoom(true, true, true);

    }
    
}
