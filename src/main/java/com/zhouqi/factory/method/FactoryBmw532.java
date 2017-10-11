package com.zhouqi.factory.method;

public class FactoryBmw532 implements Factory {
    @Override
    public Bmw createBmw() {
        return new Bmw523();
    }
}
