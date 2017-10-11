package com.zhouqi.factory.abstract_factory;

public interface AbstractFactory {
    public Engine createEngine();
    public Aircondition createAircondition();
}

class FactoryBmw320 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}

class FactoryBmw532 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
