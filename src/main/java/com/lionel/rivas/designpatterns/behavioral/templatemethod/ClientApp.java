package com.lionel.rivas.designpatterns.behavioral.templatemethod;

/**
 * This class demonstrate the Template Method Design Pattern. the {@link LoanCalculationAlgorithm} abstract class
 * defines the template loan calculation algorithm, allowing subclasses to change the implementation of the 
 * various parts of the algorithm. 
 * 
 * @author lionelrivas
 */
public class ClientApp {
    
    public static void main(String[] args) {
        LoanCalculationAlgorithm algorithm = new ExpensiveLoanAlgorithm();
        
        System.out.println("Expensive loan amount " + algorithm.calculateLoan());
        
        algorithm = new AffordableLoanAlgorithm();
        
        System.out.println("Affordable loan amount " + algorithm.calculateLoan());
    }
}