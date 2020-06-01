package com.yaoding.absfactory.guidemo.factories;

import com.yaoding.absfactory.guidemo.buttons.Button;
import com.yaoding.absfactory.guidemo.buttons.MacOSButton;
import com.yaoding.absfactory.guidemo.checkboxes.Checkbox;
import com.yaoding.absfactory.guidemo.checkboxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
