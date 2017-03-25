package com.lionel.rivas.designpatterns.structural.proxy;


/**
 * This class implements the Proxy Design Pattern for an {@link Image}. 
 * 
 * It serves to delay the loading of the image until the {@code draw()} method
 * is invoked. 
 * @author lionelrivas
 */
public class ImageProxy extends Image {

    private Image image;
    
    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void draw() {
        if (image == null) {
            image = new Image(this.url);
        }
        image.draw();
    }
}