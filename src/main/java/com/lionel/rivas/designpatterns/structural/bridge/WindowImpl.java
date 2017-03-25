package com.lionel.rivas.designpatterns.structural.bridge;

public abstract class WindowImpl {

    /**
     * Draws a window. 
     * 
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color 
     */
     public abstract void draw(int x, int y, int width, int height, String color);
    
}
