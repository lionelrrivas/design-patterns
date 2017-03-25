package com.lionel.rivas.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a button. It notifies registered observers about 
 * click events. 
 * 
 * @author lionelrivas
 */
public class Button implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    
    public void clicked() {
        change();
    }
    
    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void change() {
        observers.stream().forEach((observer) -> {
            observer.update();
        });
    }   
}