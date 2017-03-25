package com.lionel.rivas.designpatterns.behavioral.visitor;

public abstract class CarPart {
    
    public void acceptCarPartVisitor(CarPartVisitor visitor) {
        visitor.visit(this);
    }
}
