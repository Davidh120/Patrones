package Problema2;

public class Main {
    public static void main(String[] args) {
        MessagingApp messagingApp = new MessagingApp();

        IObserver cellPhone1 = new Device("cellPhone1");
        IObserver cellPhone2 = new Device("cellPhone2");
        IObserver tablet1 = new Device("tablet1");
        IObserver smartWatch1 = new Device("smartWatch1");

        messagingApp.registerObserver(cellPhone1);
        messagingApp.registerObserver(cellPhone2);
        messagingApp.registerObserver(tablet1);
        messagingApp.registerObserver(smartWatch1);

        messagingApp.newMessage("Hola, tienes un nuevo mensaje!!!");
        messagingApp.removeObserver(cellPhone1);
        messagingApp.newMessage("Hola, tienes otro nuevo mensaje!!! ");
    }
}
