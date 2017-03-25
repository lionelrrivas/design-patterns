package com.lionel.rivas.designpatterns.behavioral.templatemethod;

/**
 *
 * @author lionelrivas
 */
public class AffordableLoanAlgorithm extends LoanCalculationAlgorithm {

    @Override
    public int getBaseAmount() {
        return 5000;
    }

    @Override
    public double getInterest() {
        return .034;
    }

    @Override
    public int calculateDiscount() {
        return 100;
    }   
}