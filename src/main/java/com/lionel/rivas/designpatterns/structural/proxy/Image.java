package com.lionel.rivas.designpatterns.structural.proxy;

/**
 * This class represents an image.
 * 
 * @author lionelrivas
 */
public class Image {
    
    protected String url;

    public Image() {
    }

    public Image(String url) {
        System.out.println("Loading image.");
        this.url = url;
    }
    
    /**
     * Draws and image.
     */
    public void draw() {
        System.out.println("Drawing image from url = " + url);
    }
}
