package com.lionel.rivas.designpatterns.behavioral.observer;

/**
 * This class is a demonstration of the Observer Design Pattern. It simulates
 * a button that can notify observers of it's click event.
 *
 * @author lionelrivas
 */
public class ClientApp {
    
    public static void main(String[] args) {
        Button button = new Button();
        List list = new List();
        InputText inputText = new InputText();
        
        button.attachObserver(inputText);
        button.attachObserver(list);
        
        button.clicked();
    }
}
