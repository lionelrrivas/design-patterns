package com.lionel.rivas.designpatterns.behavioral.templatemethod;

/**
 *
 * @author lionelrivas
 */
public class ExpensiveLoanAlgorithm extends LoanCalculationAlgorithm {

    @Override
    public int getBaseAmount() {
        return 100000;
    }

    @Override
    public double getInterest() {
        return .054;
    }

    @Override
    public int calculateDiscount() {
        return 100;
    }
    
}
