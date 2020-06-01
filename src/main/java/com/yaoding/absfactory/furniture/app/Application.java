package com.yaoding.absfactory.furniture.app;

import com.yaoding.absfactory.furniture.chair.Chair;
import com.yaoding.absfactory.furniture.factory.Factory;
import com.yaoding.absfactory.furniture.sofa.Sofa;
import com.yaoding.absfactory.furniture.table.Table;

public class Application {
    Chair chair;
    Sofa sofa;
    Table table;

    public Application(Factory factory) {
        chair=factory.createChair();
        sofa=factory.createSofa();
        table = factory.createTable();
    }

    public void paint(){
        chair.paint();
        sofa.paint();
        table.paint();
    }
}
