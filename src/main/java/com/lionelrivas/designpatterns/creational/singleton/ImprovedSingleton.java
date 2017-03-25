package com.lionelrivas.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is an improvement on the Singleton design pattern. Rather than
 * enforce thread safety while creating the Singleton instance via explicit 
 * synchronization, it takes advantage of the implicit synchronization that 
 * occurs during the JVM's class loading phase to create the Singleton instance.
 * 
 * @author lionelrivas
 */
public class ImprovedSingleton {
    
    private final Map<String, Integer> map = new HashMap();
    
    private static final class SingletonHolder {
       private static final ImprovedSingleton UNIQUE_INSTANCE 
               = new ImprovedSingleton();
    }
    
    /**
     * Only {@code ImprovedSingleton} subclasses or classes within this package
     * can instantiate this class.
     */
    protected ImprovedSingleton() {}
    
    /**
     * Gets the unique {@code ImprovedSingleton} instance.
     * 
     * @return {@link ImprovedSingleton}
     */
    public static ImprovedSingleton getInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
    
    /**
     * Prints a hello message. 
     */
    public void sayHello() {
        System.out.println("Hello from "+getClass().getName());
    }
    
    public Integer get(String s) {
        return map.get(s);
    }
}