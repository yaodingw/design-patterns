package com.yaoding.absfactory.guidemo.factories;

import com.yaoding.absfactory.guidemo.buttons.Button;
import com.yaoding.absfactory.guidemo.buttons.WindowsButton;
import com.yaoding.absfactory.guidemo.checkboxes.Checkbox;
import com.yaoding.absfactory.guidemo.checkboxes.WindowsCheckBox;

public class WindowsOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}
