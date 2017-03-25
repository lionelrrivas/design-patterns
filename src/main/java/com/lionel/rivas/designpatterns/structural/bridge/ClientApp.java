package com.lionel.rivas.designpatterns.structural.bridge;

/**
 * A simple app that demonstrates the Bridge Design Pattern.
 * 
 * @author lionelrivas
 */
public class ClientApp {
    public static void main(String[] args) {
        IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new MacWindowImpl());
        iconWindow.drawIcon();
        
        iconWindow.setWindow(new LinuxWindowImpl());
        iconWindow.drawIcon();
    }
}
