package com.lionel.rivas.designpatterns.additional.ioc;

/**
 * This class reads a file from a Window file system.
 * 
 * @author lionelrivas
 */
public class WindowsFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Windows file system read.";
    }
    
}
