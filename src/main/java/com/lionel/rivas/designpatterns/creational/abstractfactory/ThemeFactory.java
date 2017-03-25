package com.lionel.rivas.designpatterns.creational.abstractfactory;

/**
 * This interface defines the contract to which {@link ThemeFactory} implementers 
 * must adhere.
 * 
 * @author lionelrivas
 */
public interface ThemeFactory {
    
    /**
     * Creates a {@link Window}.
     * @return {@link Window}
     */
    public Window createWindow();
    
    /**
     * Creates a {@link ScrollBar}
     * 
     * @return {@link ScrollBar}
     */
    public ScrollBar createScrollBar();
}
