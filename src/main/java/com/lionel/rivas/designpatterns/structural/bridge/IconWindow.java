package com.lionel.rivas.designpatterns.structural.bridge;

/**
 * This class draws and icon window. 
 * 
 * @author lionelrivas
 */
public class IconWindow extends Window {
    
    /**
     * Draws an icon. 
     */
    public void drawIcon() {
        draw(0, 10, 20, 15, "white");
        draw(0, 30, 20, 35, "black");
    }
}
