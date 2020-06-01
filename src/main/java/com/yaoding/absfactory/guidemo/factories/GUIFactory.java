package com.yaoding.absfactory.guidemo.factories;

import com.yaoding.absfactory.guidemo.buttons.Button;
import com.yaoding.absfactory.guidemo.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
