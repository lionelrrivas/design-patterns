package com.lionel.rivas.designpatterns.behavioral.command;

/**
 * This interface is the contract to which all {@link Command} implementors 
 * must adhere. 
 * 
 * @author lionelrivas
 */
public interface Command {
    
    /**
     * The action to be performed by this command.
     */
    public void action();
    
    /**
     * Undo the action that was previously performed. 
     */
    public void undo();
    
}
