package com.lionel.rivas.designpatterns.behavioral.visitor;

public class CarPartUpgradeVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("visit(): Upgrading car part " + carPart);
    }
    
}
