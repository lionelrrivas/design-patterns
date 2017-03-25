package com.lionel.rivas.designpatterns.structural.decorator;

public class ClientApp {
    
    public static void main(String[] args) {
        Window window = new Window();
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
        ScrollBarWindowDecorator scrollBarWindowDecorator = new ScrollBarWindowDecorator(iconWindowDecorator);
        scrollBarWindowDecorator.draw();
    }
}
