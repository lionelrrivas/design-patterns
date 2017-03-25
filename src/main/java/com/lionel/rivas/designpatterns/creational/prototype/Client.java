package com.lionel.rivas.designpatterns.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Image image = new Image();
        image.setUrl("http://www.lionelrivas.com");
        
        GraphicTool tool = new GraphicTool(image);
        Graphic graphic = tool.createGraphic();
        
        System.out.println("Graphic instance " + graphic.getClass().getSimpleName());
        System.out.println("Graphic instance url " + graphic.getUrl());
        
        image.setUrl("http://www.sociocomedia.com");
        graphic = tool.createGraphic();
        System.out.println("Graphic instance url " + graphic.getUrl());
        
        Video video = new Video();
        video.setUrl("http://www.sociocomedia.video.com");
        
        tool.setProtoType(video);
        
        graphic = tool.createGraphic();
        System.out.println("Graphic instance " + graphic.getClass().getSimpleName());
        System.out.println("Graphic instance url " + graphic.getUrl());
    }
}