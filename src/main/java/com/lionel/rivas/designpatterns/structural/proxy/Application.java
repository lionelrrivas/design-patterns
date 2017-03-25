package com.lionel.rivas.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * This class simulates an application that draws images. 
 * 
 * @author lionelrivas
 */
public class Application {
    
    private List<Image> images = new ArrayList();
    
    public Application(List<Image> images) {
        this.images = images;
    }
    
    public void draw() {
        images.stream().forEach((image) -> {
            image.draw();
        });
    }
}
