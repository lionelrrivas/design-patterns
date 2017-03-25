package com.lionel.rivas.designpatterns.structural.bridge;

public class MacWindowImpl extends WindowImpl {

    @Override
    public void draw(int x, int y, int width, int height, String color) {
        System.out.println("Drawing a mac window, x = " + x + ", y = " + y + 
                ", width = " + width + ", height = " + height + ", color = " + color);
    }
}