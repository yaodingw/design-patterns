package com.yaoding.absfactory.guidemo.app;

import com.yaoding.absfactory.guidemo.buttons.Button;
import com.yaoding.absfactory.guidemo.checkboxes.Checkbox;
import com.yaoding.absfactory.guidemo.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
