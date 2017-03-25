package com.lionel.rivas.designpatterns.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new HondaFactory();
        Car car = carFactory.createCar();
        
        carFactory = new BMWFactory();
        carFactory.createCar();
        
        car.drive();
        
    }
}