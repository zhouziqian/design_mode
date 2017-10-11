package com.zhouqi.factory.abstract_factory;

public interface Aircondition {
}

class AirconditionA implements Aircondition {
    public AirconditionA() {
        System.out.println("build Aircondition A");
    }
}

class AirconditionB implements Aircondition {
    public AirconditionB() {
        System.out.println("build Aircondition B");
    }
}
