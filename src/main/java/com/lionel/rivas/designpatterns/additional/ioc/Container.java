package com.lionel.rivas.designpatterns.additional.ioc;

/**
 * This class is a participant in the IoC Design Pattern. It simulates an application container start up. During the 
 * initialization the {@link ImageService} is instantiated and the specific implementation of the {@link FileSystem}
 * that it uses to read image is injected. 
 * 
 * @author lionelrivas
 */
public class Container {
    
    private ImageService imageService;
    
    public void init() {
        imageService = new ImageService();
        imageService.setFileSystem(new UnixFileSystem());
    }
    
    public ImageService getImageService() {
        return imageService;
    }
    
    public static void main(String[] args) {
        Container container = new Container();
        container.init();
        
        ImageService imageService = container.getImageService();
        System.out.println(imageService.readFile());
    }   
}