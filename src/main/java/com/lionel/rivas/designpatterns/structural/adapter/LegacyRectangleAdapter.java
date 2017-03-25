package com.lionel.rivas.designpatterns.structural.adapter;

/**
 * This class adapts {@link LegacyRectangle} functionality to {@link Rectangle}
 * functionality. 
 * 
 * @author lionelrivas
 */
public class LegacyRectangleAdapter extends Rectangle {

    private final LegacyRectangle legacyRectangle;
    
    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    
    /**
     * Determines the size of a {@link Rectangle}. 
     * 
     * @return 
     */
     @Override
    public int determinSize() {
        return legacyRectangle.calculateSize();
    }
}