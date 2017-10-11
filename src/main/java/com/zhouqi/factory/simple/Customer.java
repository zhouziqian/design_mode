package com.zhouqi.factory.simple;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Bmw bmw320=factory.craeteBmw(320);
        Bmw bmw523=factory.craeteBmw(523);
    }
}
