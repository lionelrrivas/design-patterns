package com.lionel.rivas.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {
    
    private final List<CarPart> parts = new ArrayList<>();
    
    public void addCarPart(CarPart carPart) {
        parts.add(carPart);
    }
    
    public void print() {
        CarPartVisitor visitor = new CarPartPrintVisitor();
        parts.stream().forEach((part) -> {
            part.acceptCarPartVisitor(visitor);
        });
    }
    
    public void upgrade() {
        CarPartVisitor visitor = new CarPartUpgradeVisitor();
        parts.stream().forEach((part) -> {
            part.acceptCarPartVisitor(visitor);
//            visitor.visit(part);
        });
    }
    
    public void render() {
        CarPartVisitor visitor = new CarPartRenderVisitor();
        parts.stream().forEach((part) -> {
            part.acceptCarPartVisitor(visitor);
//            visitor.visit(part);
        });
    }
}
