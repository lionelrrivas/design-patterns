package com.lionel.rivas.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ClientApp {
    
    public static void main(String[] args) {
        List<Image> images = new ArrayList<>();
        images.add(new ImageProxy("http://lionelrivas.com"));
        images.add(new ImageProxy("http://sociocomedia.com"));
        
        Application application = new Application(images);
        
        System.out.println("Application setup.");
        
        application.draw();
    }
}
