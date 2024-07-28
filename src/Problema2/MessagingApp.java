package Problema2;

import java.util.ArrayList;
import java.util.List;

public class MessagingApp implements ISubject{
    List<IObserver> observersList;

    public MessagingApp(){
        observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(IObserver observer : observersList){
            observer.update(message);
        }
    }

    public void newMessage(String message) {
        System.out.println("Nuevo mensaje: " + message);
        notifyObservers(message);
    }
}
