package com.lionel.rivas.designpatterns.behavioral.templatemethod;

/**
 * This class is a participant in the Template Method Design Pattern. It defines the algorithm for calculating
 * a loan. Subclasses can provide a different implementation of the algorithm by overriding any of the abstract methods. 
 * 
 * @author lionelrivas
 */
public abstract class LoanCalculationAlgorithm {
    
    public int calculateLoan() {
        return (int) (getBaseAmount() * getInterest() - calculateDiscount());
    }
    
    public abstract int getBaseAmount();
    
    public abstract double getInterest();
    
    public abstract int calculateDiscount();
}