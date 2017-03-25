package com.lionelrivas.designpatterns.creational.singleton;

public class Client {
    
    public static void main(String[] args) {
        Singleton.getInstance().sayHello();
        ImprovedSingleton.getInstance().sayHello();
        
        //The unique instance will still be an instance of the superclass.
        ImprovedSingletonSubclass.getInstance().sayHello();
        
    }
}
