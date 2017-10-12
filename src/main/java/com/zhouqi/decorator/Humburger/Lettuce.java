package com.zhouqi.decorator.Humburger;

public class Lettuce extends Condiment {
    private Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public double getPrice() {
       return humburger.getPrice()+1.5;
    }

    @Override
    public String getName() {
        return humburger.getName()+"家生菜";
    }
}
