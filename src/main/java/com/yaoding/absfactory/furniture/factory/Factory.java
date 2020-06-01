package com.yaoding.absfactory.furniture.factory;

import com.yaoding.absfactory.furniture.chair.Chair;
import com.yaoding.absfactory.furniture.sofa.Sofa;
import com.yaoding.absfactory.furniture.table.Table;

public interface Factory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
