package com.lionel.rivas.designpatterns.creational.abstractfactory;

/**
 * This class is responsible for creating the {@link Window} and {@link ScrollBar}
 * for the Metal theme.
 * 
 * @author lionelrivas
 */
public class MetalThemeFactory implements ThemeFactory {

    private static final class SingletonHolder {
        private static final MetalThemeFactory UNIQUE_INSTANCE = new MetalThemeFactory();
    }
    
    private MetalThemeFactory() {}
    
    @Override
    public Window createWindow() {
        return new MetalThemeWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MetalThemeScrollBar();
    }  
    
    public static ThemeFactory getInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
}