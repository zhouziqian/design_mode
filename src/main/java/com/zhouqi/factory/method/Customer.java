package com.zhouqi.factory.method;

public class Customer {
    public static void main(String[] args) {
        Factory factoryBmw320 = new FactoryBmw320();
        Factory factoryBmw532 = new FactoryBmw532();

        Bmw bmw320 = factoryBmw320.createBmw();
        Bmw bmw532 = factoryBmw532.createBmw();
    }

}
