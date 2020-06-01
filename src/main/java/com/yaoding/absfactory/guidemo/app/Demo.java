package com.yaoding.absfactory.guidemo.app;

import com.yaoding.absfactory.guidemo.factories.GUIFactory;
import com.yaoding.absfactory.guidemo.factories.MacOSFactory;
import com.yaoding.absfactory.guidemo.factories.WindowsOSFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        }else{
            factory = new WindowsOSFactory();
        }
        app = new Application(factory);
        return app;

    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
