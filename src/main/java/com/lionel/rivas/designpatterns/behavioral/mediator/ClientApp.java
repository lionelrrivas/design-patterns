package com.lionel.rivas.designpatterns.behavioral.mediator;

/**
 * This class is a demonstration of the Mediator Design Pattern. It simulates a user interface with a drop-down list. 
 * When an item is selected from the list, a text field is updated with the selected item's value. 
 * 
 * @author lionelrivas
 */
public class ClientApp {
    
    public static void main(String[] args) {
        TextField textField = new TextField();
        List itemList = new List();
        
        ScreenDirector screenDirector = new ScreenDirectorImpl(textField);
        
        
        itemList.setScreenDirector(screenDirector);
        
        itemList.addListItem("Item one");
        itemList.addListItem("Item two");
        itemList.addListItem("Item three");
        
        itemList.selectItem(2);
        
        System.out.println("Selected item is " + textField.getValue());
    }
}
