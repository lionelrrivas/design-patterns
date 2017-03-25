package com.lionel.rivas.designpatterns.behavioral.chainofresponsibility;

/**
 * This class calculates payment information during a check out request. 
 * 
 * @author lionelrivas
 */
public class PaymentCalculationHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("handleCheckout(): Calculating payment.");
        if (nextHandler != null) {
            nextHandler.handleCheckout();
        }
    }
    
}
