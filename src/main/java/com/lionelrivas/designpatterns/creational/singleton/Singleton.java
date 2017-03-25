package com.lionelrivas.designpatterns.creational.singleton;

/**
 * A class to demonstrate the Singleton design pattern. 
 * 
 * @author lionelrivas
 */
public class Singleton {
    
    /**
     * Unique instance of the {@code Singleton}. 
     */
    private static Singleton uniqueInstance;
    
    /**
     * Only {@code Singleton} subclasses or classes within the package can
     * instantiate this class.
     * 
     */
    protected Singleton() {}
    
    /**
     * Creates a {@code Singleton} instance. Synchronization enforces thread
     * safety, however, in this case it does not guarantee that multiple
     * instances will not be created. 
     * 
     * @return {@link Singleton}
     */
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
    /**
     * Prints a hello message. 
     */
    public void sayHello() {
        System.out.println("Hello from " + getClass().getName());
    }
}