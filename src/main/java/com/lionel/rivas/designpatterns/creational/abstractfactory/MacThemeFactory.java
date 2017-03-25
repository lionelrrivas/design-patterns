package com.lionel.rivas.designpatterns.creational.abstractfactory;

/**
 * This class is responsible for creating the {@link Window} and {@link ScrollBar}
 * for the Mac theme.
 * 
 * @author lionelrivas
 */
public class MacThemeFactory implements ThemeFactory {

    private static final class SingletonHolder {
        private static final ThemeFactory UNIQUE_INSTANCE = new MacThemeFactory();
    }
    
    private MacThemeFactory() {}
    
     @Override
    public Window createWindow() {
        return new MacThemeWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacThemeScrollBar();
    }
    
    public static ThemeFactory getInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
    
}
