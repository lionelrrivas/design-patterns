package com.lionel.rivas.designpatterns.additional.ioc;

/**
 * This interface specifies the contract for reading a file from a file system.
 * 
 * @author lionelrivas
 */
public interface FileSystem {
    
    /**
     * Reads a file from a file system. 
     * 
     * @return 
     */
    String readFile();
    
}
