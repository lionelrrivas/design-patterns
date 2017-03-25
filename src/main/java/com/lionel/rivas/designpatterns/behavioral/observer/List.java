package com.lionel.rivas.designpatterns.behavioral.observer;

/**
 *
 * @author lionelrivas
 */
public class List implements Observer {

    private void setListValue(int value) {
        System.out.println("setListValue() method called. Value = " + value);
    }
    
    @Override
    public void update() {
        setListValue(1);
    }
    
}
