package com.lionel.rivas.designpatterns.behavioral.mediator;

/**
 * This class simulates a screen component that is interested in updating the value of a {@link TextField}. 
 * 
 * @author lionelrivas
 */
public class ScreenDirectorImpl implements ScreenDirector {

    private TextField textField;

    public ScreenDirectorImpl(TextField textField) {
        this.textField = textField;
    }
    
    @Override
    public void itemSelected(String item) {
        textField.setValue(item);
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }
}