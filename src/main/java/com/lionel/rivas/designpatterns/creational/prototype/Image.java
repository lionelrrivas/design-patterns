package com.lionel.rivas.designpatterns.creational.prototype;

public class Image extends Graphic {

    private String url;
    
    
    public Graphic clone() {
        Image imageClone = new Image();
        imageClone.setUrl(this.url);
        return imageClone;
    }

    @Override
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }   
}