package com.yaoding.absfactory.guidemo.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("you have create MacOSButton!");
    }
}
