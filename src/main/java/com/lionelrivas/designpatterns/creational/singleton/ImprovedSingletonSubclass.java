package com.lionelrivas.designpatterns.creational.singleton;

/**
 * A class to demonstrate that a singleton subclass produces the 
 * same behavior as the superclass. 
 * 
 * @author lionelrivas
 */
public class ImprovedSingletonSubclass extends ImprovedSingleton {
    
    public void doStuff() {
        new ImprovedSingleton();
    }
    
}
