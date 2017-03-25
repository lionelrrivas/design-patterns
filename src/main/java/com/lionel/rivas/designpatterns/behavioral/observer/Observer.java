package com.lionel.rivas.designpatterns.behavioral.observer;

/**
 * This is the {@link Observer} interface. It can be registered with a  
 * {@link Subject} and be notified of changes to the subject's state. 
 * 
 * @author lionelrivas
 */
public interface Observer {
   
    /**
     * Acknowledges a change notification from a {@link Subject} with which it
     * is registered.
     *
     */
    public void update();
    
}
