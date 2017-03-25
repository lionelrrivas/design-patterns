package com.lionel.rivas.designpatterns.behavioral.chainofresponsibility;

/**
 * This class demonstrates the Chain of Responsibility Design Pattern. 
 * It simulates the forwarding of a request from one {@link CheckoutHandler} to another when 
 * perhaps after the checkout button has been clicked on a checkout page.
 * 
 * @author lionelrivas
 */
public class ClientApp {
    
    public static void main(String[] args) {
        CheckoutHandler paymentHandler = new PaymentCalculationHandler();
        CheckoutHandler customerInfoHandler = new CustomerInfoCheckoutHandler();
        paymentHandler.setNextHandler(customerInfoHandler);
        
        paymentHandler.handleCheckout();
        
        
    }
}
