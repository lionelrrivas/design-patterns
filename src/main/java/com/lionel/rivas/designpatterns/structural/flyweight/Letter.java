package com.lionel.rivas.designpatterns.structural.flyweight;

/**
 * This class represents a letter. It maintains a reference to a {@link String}
 * to represent the {@link Letter}.
 * 
 * @author lionelrivas
 */
public class Letter {
    
    private final String value;

    public Letter(String value) {
        System.out.println("Letter created with value " + value);
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}