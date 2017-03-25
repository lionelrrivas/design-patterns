package com.lionel.rivas.designpatterns.behavioral.chainofresponsibility;

/**
 * This class handles updating customer information during a checkout request. 
 * 
 * @author lionelrivas
 */
public class CustomerInfoCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("handleCheckout(): Adding customer information.");
        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
    
}
