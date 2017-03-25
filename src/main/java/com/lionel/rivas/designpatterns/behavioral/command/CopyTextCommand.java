package com.lionel.rivas.designpatterns.behavioral.command;


/**
 * This class will duplicate the current text in a {@link TextEditor}.
 * 
 * @author lionelrivas
 */
public class CopyTextCommand extends AbstractCommand {

    private String undoText;

    public CopyTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(undoText + undoText);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
