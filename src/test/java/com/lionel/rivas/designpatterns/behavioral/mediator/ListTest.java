/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lionel.rivas.designpatterns.behavioral.mediator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author lionelrivas
 */
public class ListTest {
    
    
    @Before
    public void setUp() {
        
    }

    /**
     * Test of selectItem method, of class List.
     */
    @Test
    public void testSelectItem() {
        System.out.println("selectItem");
        
        TextField textField = new TextField();
        
        ScreenDirector screenDirector = new ScreenDirectorImpl(textField);
        
        List classUnderTest = new List();
        
        classUnderTest.setScreenDirector(screenDirector);
        
        classUnderTest.addListItem("One");
        classUnderTest.addListItem("Two");
        classUnderTest.addListItem("Three");
        
        classUnderTest.selectItem(0);
        
        assertEquals("One", textField.getValue());
        
    }

    /**
     * Test of addListItem method, of class List.
     */
    @Test
    public void testAddListItem() {
        
        ScreenDirector screenDirector = new ScreenDirectorImpl(new TextField());
        List instance = new List();
        instance.addListItem("Four");
        instance.selectItem(0);
        
        screenDirector.itemSelected("Four");
        
    }

    /**
     * Test of setScreenDirector method, of class List.
     */
    @Test
    public void testSetScreenDirector() {
        System.out.println("setScreenDirector");
        ScreenDirector screenDirector = null;
        List instance = new List();
        instance.setScreenDirector(screenDirector);
    }
    
}
