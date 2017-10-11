package com.zhouqi.factory.abstract_factory;

public class FactoryBmw532 implements Factory {
    @Override
    public Bmw createBmw() {
        return new Bmw523();
    }
}
