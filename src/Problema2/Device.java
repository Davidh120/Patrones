package Problema2;

public class Device implements IObserver {
    String deviceId;

    public Device(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String message) {
        System.out.println("El dispositivo " + deviceId + " recibio el siguiente mensaje: " + message);
    }
}
