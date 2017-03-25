package com.lionel.rivas.designpatterns.creational.factorymethod;

public class HondaFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Honda();
    }
    
}
