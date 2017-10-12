package com.zhouqi.decorator.Humburger;

public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name="ChickenBurger";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
