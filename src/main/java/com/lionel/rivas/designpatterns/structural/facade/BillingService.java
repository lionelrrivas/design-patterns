package com.lionel.rivas.designpatterns.structural.facade;

/**
 * This class is responsible for creating a {@link Bill}.
 * 
 * @author lionelrivas
 */
public class BillingService {
    
    /**
     * Creates a {@link Bill} for {@code amount}.
     * 
     * @param amount the amount of the bill to be created.
     * 
     * @return {@link Bill}
     */
    public Bill creatBill(int amount) {
        return new Bill(amount);
    }
}
