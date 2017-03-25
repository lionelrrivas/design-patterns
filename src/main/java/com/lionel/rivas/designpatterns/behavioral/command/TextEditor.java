package com.lionel.rivas.designpatterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class simulates a text editor that can perform and undo action commands. 
 * It is a demonstration of the Command Design Pattern. The Command Pattern lets you 
 * encapsulate a request as an object, thereby letting you parameterize clients 
 * with different requests, queue or log requests, and support undoing operations.
 * 
 * @author lionelrivas
 */
public class TextEditor {
    
    private String text;
    
    private final Queue<Command> commandQueue = new LinkedList<>();
    
    private void executeAction(Command command) {
        command.action();
        commandQueue.add(command);
    }
    
    private void undoAction() {
        Command command = commandQueue.poll();
        if (command != null) {
            command.undo();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setText("Hello there!!");
        
        System.out.println("text = " + textEditor.getText());
        Command clearTextCommand = new ClearTextCommand(textEditor);
        textEditor.executeAction(clearTextCommand);
        
        System.out.println("text = " + textEditor.getText());
        textEditor.undoAction();
        
        Command funTextCommand = new FunTextCommand(textEditor, " fun text");
        textEditor.executeAction(funTextCommand);
        
        System.out.println("text = " + textEditor.getText());
        
        textEditor.undoAction();
        
        System.out.println("text = " + textEditor.getText());
    }
}