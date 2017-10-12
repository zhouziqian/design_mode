package com.zhouqi.decorator.Humburger;

public class Chilli extends Humburger{
    Humburger humburger;

    public Chilli(Humburger humburger){
        this.humburger = humburger;

    }

    @Override
    public String getName() {
        return humburger.getName()+" 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();  //辣椒是免费的哦
    }
}
