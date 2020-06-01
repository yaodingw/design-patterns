package com.yaoding.absfactory.furniture.factory;

import com.yaoding.absfactory.furniture.chair.ArtDeco;
import com.yaoding.absfactory.furniture.chair.Chair;
import com.yaoding.absfactory.furniture.sofa.Sofa;
import com.yaoding.absfactory.furniture.table.Table;

public class ArtDecoFactory implements Factory {
    @Override
    public Chair createChair() {
        return new ArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new com.yaoding.absfactory.furniture.sofa.ArtDeco();
    }

    @Override
    public Table createTable() {
        return new com.yaoding.absfactory.furniture.table.ArtDeco();
    }
}
