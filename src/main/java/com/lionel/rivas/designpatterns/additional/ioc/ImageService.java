package com.lionel.rivas.designpatterns.additional.ioc;

/**
 * This class is a participant in the IoC Design Pattern. It reads an image files from a {@link FileSystem}. 
 * The specific {@link FileSystem} implementation is set a runtime by a {@link Container}. 
 * 
 * @author lionelrivas
 */
public class ImageService {
    
    private FileSystem fileSystem;
    
    public String readFile() {
        return fileSystem.readFile();
    }
    
    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }
}
