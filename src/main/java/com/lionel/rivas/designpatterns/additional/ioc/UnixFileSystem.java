package com.lionel.rivas.designpatterns.additional.ioc;

/**
 * This class reads a file from a Unix file system. 
 * 
 * @author lionelrivas
 */
public class UnixFileSystem implements FileSystem {

    @Override
    public String readFile() {
        return "Unix file system read.";
    }
    
}
