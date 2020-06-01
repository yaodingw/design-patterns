package com.yaoding.absfactory.furniture.app;

import com.yaoding.absfactory.furniture.factory.ArtDecoFactory;
import com.yaoding.absfactory.furniture.factory.Factory;
import com.yaoding.absfactory.furniture.factory.ModernFactory;
import com.yaoding.absfactory.furniture.factory.VictorianFactory;

public class Demo {
    public static Application configureApplication(String type) {
        Application app;
        Factory factory;
        switch (type) {
            case "art":
                factory = new ArtDecoFactory();
                app = new Application(factory);
                break;
            case "vic":
                factory = new VictorianFactory();
                app = new Application(factory);
                break;
            default:
                factory = new ModernFactory();
                app = new Application(factory);
                break;
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication("vic");
        app.paint();
        app = configureApplication("art");
        app.paint();
        app = configureApplication("");
        app.paint();
    }
}
