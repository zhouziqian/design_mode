package com.zhouqi.factory.abstract_factory;

public interface Engine {

}

class  EngineA implements Engine {
    public EngineA() {
        System.out.println("build Engine A");
    }
}

class EngineB implements Engine {
    public EngineB() {
        System.out.println("build Engine B");
    }
}