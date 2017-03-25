package com.lionel.rivas.designpatterns.structural.bridge;

public class LinuxWindowImpl extends WindowImpl {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing a linux window, x = " + x + ", y = " + y + 
                ", width = " + width + ", height = " + height + ", color = " + color);
    }
    
}
