package com.lionel.rivas.designpatterns.behavioral.visitor;

public class CarPartPrintVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("visit(): Printing " + carPart);
    }
    
}
