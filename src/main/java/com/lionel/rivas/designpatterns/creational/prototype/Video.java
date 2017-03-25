package com.lionel.rivas.designpatterns.creational.prototype;

public class Video extends Graphic {

    private String url;
    
    @Override
    public Graphic clone() {
        Video videoClone = new Video();
        videoClone.setUrl(this.url);
        return videoClone;
    }

    @Override
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }   
}