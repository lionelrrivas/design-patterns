package com.lionel.rivas.designpatterns.behavioral.chainofresponsibility;

/**
 * This interface is a participant in the Chain of Responsibility Design Pattern. It provides the abstraction for 
 * how a checkout request is handled. 
 * 
 * @author lionelrivas
 */
public abstract class CheckoutHandler {
    
    protected CheckoutHandler nextHandler;
    
    /**
     * The action to be performed on a checkout request. 
     */
    public abstract void handleCheckout();
    
    /**
     * Sets the next {@link CheckoutHandler} in the handler chain.
     * 
     * @param nextHandler 
     */
    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
