package com.yaoding.absfactory.furniture.factory;

import com.yaoding.absfactory.furniture.chair.Chair;
import com.yaoding.absfactory.furniture.chair.Victorian;
import com.yaoding.absfactory.furniture.sofa.Sofa;
import com.yaoding.absfactory.furniture.table.Table;

public class VictorianFactory implements Factory {
    @Override
    public Chair createChair() {
        return new Victorian();
    }

    @Override
    public Sofa createSofa() {
        return new com.yaoding.absfactory.furniture.sofa.Victorian();
    }

    @Override
    public Table createTable() {
        return new com.yaoding.absfactory.furniture.table.Victorian();
    }
}
