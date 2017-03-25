package com.lionel.rivas.designpatterns.creational.factorymethod;

/**
 * This class defines the contract for all {@link CarFactory} implementors.
 * 
 */
public abstract class CarFactory {
    
    /**
     * Creates an implementation of {@link Car}.
     * 
     * @return {@link Car}
     */
    public abstract Car createCar();
}
