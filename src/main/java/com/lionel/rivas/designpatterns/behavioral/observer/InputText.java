package com.lionel.rivas.designpatterns.behavioral.observer;

/**
 * This class simulates a text field where button clicks result in changes 
 * to the input field's text. 
 * 
 * @author lionelrivas
 */
public class InputText implements Observer {

    /**
     * Sets the text value. 
     * 
     * @param text the text to set
     */
    private void setText(String text) {
        System.out.println("setText() method called. " + text);
    }
    
    @Override
    public void update() {
        setText("Button was clicked.");
    }   
}