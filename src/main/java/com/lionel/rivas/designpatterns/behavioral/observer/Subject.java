package com.lionel.rivas.designpatterns.behavioral.observer;

/**
 *
 * @author lionelrivas
 */
public interface Subject {
    
    void attachObserver(Observer observer);
    
    void detachObserver(Observer observer);
    
    void change();
}
