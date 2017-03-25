package com.lionel.rivas.designpatterns.behavioral.visitor;

public class CarPartRenderVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("visit(): Rendering car part " + carPart);
    }
    
}
