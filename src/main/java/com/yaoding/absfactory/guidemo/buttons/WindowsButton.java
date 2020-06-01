package com.yaoding.absfactory.guidemo.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("you have created WindowsButton");
    }
}
