package com.yaoding.absfactory.furniture.factory;

import com.yaoding.absfactory.furniture.chair.Chair;
import com.yaoding.absfactory.furniture.chair.Modern;
import com.yaoding.absfactory.furniture.sofa.Sofa;
import com.yaoding.absfactory.furniture.table.Table;

public class ModernFactory implements Factory {
    @Override
    public Chair createChair() {
        return  new Modern();
    }

    @Override
    public Sofa createSofa() {
        return new com.yaoding.absfactory.furniture.sofa.Modern();
    }

    @Override
    public Table createTable() {
        return new com.yaoding.absfactory.furniture.table.Modern();
    }
}
