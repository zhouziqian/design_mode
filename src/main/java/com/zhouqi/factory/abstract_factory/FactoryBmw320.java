package com.zhouqi.factory.abstract_factory;

public class FactoryBmw320 implements Factory {

    @Override
    public Bmw createBmw() {
        return new Bmw320();
    }
}
