package com.zhouqi.factory.method;

public class FactoryBmw320 implements Factory {

    @Override
    public Bmw createBmw() {
        return new Bmw320();
    }
}
