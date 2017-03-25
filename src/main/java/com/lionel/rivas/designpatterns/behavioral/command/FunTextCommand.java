package com.lionel.rivas.designpatterns.behavioral.command;

/**
 * This class will add text to a {@link TextEditor}. 
 * 
 * @author lionelrivas
 */
public class FunTextCommand extends AbstractCommand {

    private final String funText;

    private String undoText;

    public FunTextCommand(TextEditor textEditor, String funText) {
        super(textEditor);
        this.funText = funText;
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(undoText + funText);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
