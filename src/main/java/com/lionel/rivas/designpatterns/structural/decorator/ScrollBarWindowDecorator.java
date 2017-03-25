package com.lionel.rivas.designpatterns.structural.decorator;

public class ScrollBarWindowDecorator extends WindowDecorator {

    public ScrollBarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing scroll bar.");
        window.draw();
    }
    
}
