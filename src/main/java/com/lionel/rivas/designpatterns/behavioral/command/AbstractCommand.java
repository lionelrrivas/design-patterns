package com.lionel.rivas.designpatterns.behavioral.command;

public abstract class AbstractCommand implements Command {

    private final TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}