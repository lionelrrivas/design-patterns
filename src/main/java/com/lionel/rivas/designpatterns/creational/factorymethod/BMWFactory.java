package com.lionel.rivas.designpatterns.creational.factorymethod;

public class BMWFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new BMW();
    }
    
}
