package com.lionel.rivas.designpatterns.structural.bridge;

/**
 * This class is a generic representation of a generic window for a computing
 * platform. It performs its drawing with a specific platform implementation of 
 * {@link WindowImpl}.
 * 
 * @author lionelrivas
 */
public class Window {
    
    private WindowImpl windowImpl;
    
    /**
     * Draws a window. 
     * 
     * @param x the {@code x} coordinate.
     * @param y the {@code y} coordinate.
     * @param width the width of the window.
     * @param height the height of the window.
     * @param color the color of the window.
     */
    public void draw(int x, int y, int width, int height, String color) {
        windowImpl.draw(x, y, width, height, color);
    }
    
    /**
     * Sets the window implementation.
     * 
     * @param windowImpl 
     */
    public void setWindow(WindowImpl windowImpl) {
        this.windowImpl = windowImpl;
    }
}
