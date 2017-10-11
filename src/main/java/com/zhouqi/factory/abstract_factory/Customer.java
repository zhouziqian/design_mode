package com.zhouqi.factory.abstract_factory;

public class Customer {
    public static void main(String[] args) {
        AbstractFactory factoryBmw320 = new FactoryBmw320();
        AbstractFactory factoryBmw532 = new FactoryBmw532();

        factoryBmw320.createEngine();
        factoryBmw320.createAircondition();
        factoryBmw532.createEngine();
        factoryBmw532.createAircondition();
    }
}
