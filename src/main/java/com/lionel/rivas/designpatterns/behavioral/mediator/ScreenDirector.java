package com.lionel.rivas.designpatterns.behavioral.mediator;

/**
 * This interface is a participant in the Mediator Design Pattern. It provides the loose coupling between one screen 
 * component and another. For instance if an item in a drop-down list is selected, a text field should reflect the 
 * selected item value. By introducing a {@link ScreenDirector} implementation, we provide loose coupling between the 
 * text field and the drop-down list, thereby promoting re-usability of the {@link List}.  
 * 
 * @author lionelrivas
 */
public interface ScreenDirector {
    
    /**
     * Sets the selected item value of a screen component. 
     * 
     * @param item 
     */
    void itemSelected(String item);
    
}
