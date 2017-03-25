package com.lionel.rivas.designpatterns.creational.abstractfactory;

public class Client {
    
    public static void main(String[] args) {
        ThemeFactory factory = MacThemeFactory.getInstance();
        initializeGUI(factory);
        
        factory = MetalThemeFactory.getInstance();
        initializeGUI(factory);
    }
    
    private static void initializeGUI(ThemeFactory factory) {
        initializeGUI(factory.createWindow(), factory.createScrollBar());
    }
    
    private static void initializeGUI(Window window, ScrollBar scrollBar) {
        System.out.println("Initializing with " + 
                window.getClass().getSimpleName() + " and " + 
                scrollBar.getClass().getSimpleName());
    }   
}