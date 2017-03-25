package com.lionel.rivas.designpatterns.behavioral.visitor;

public class ClientApp {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.addCarPart(new HeadLight());
        car.addCarPart(new HeadLight());
        
        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());
        
        car.addCarPart(new Engine());
        
        car.upgrade();
        car.print();
        car.render();
    }
}
