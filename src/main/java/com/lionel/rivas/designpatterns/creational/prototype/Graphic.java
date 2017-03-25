package com.lionel.rivas.designpatterns.creational.prototype;

/**
 * This class represents a toolkit graphic. 
 * 
 * @author lionelrivas
 */
public abstract class Graphic {
    
    public abstract Graphic clone();
    
    /**
     * Returns the URL of this {@link Graphic} as a {@link String}. 
     * 
     * @return {@link String}
     */
    public abstract String getUrl();
    
}
