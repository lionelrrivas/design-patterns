package com.lionel.rivas.designpatterns.behavioral.mediator;

import java.util.ArrayList;

/**
 * This class simulates a drop-down list on a user interface. It uses a {@link ScreenDirector} to set the value
 * of another UI component to the value of the selected item. 
 * 
 * @author lionelrivas
 */
public class List {
    
    private final java.util.List<String> itemList = new ArrayList<>();
    
    private ScreenDirector screenDirector;
    
    public void selectItem(int index) {
        String listItem = itemList.get(index);
        if (screenDirector != null) {
            screenDirector.itemSelected(listItem);
        }
    }
    
    public void addListItem(String listItem) {
        itemList.add(listItem);
    }

    public void setScreenDirector(ScreenDirector screenDirector) {
        this.screenDirector = screenDirector;
    }
}