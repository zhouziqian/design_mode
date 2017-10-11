package com.zhouqi.Builder;

public class WomanBuilder implements PersonBuilder {
    Person person;

    public WomanBuilder() {
        this.person = person;
    }

    @Override
    public void buildHead() {
        System.out.println("begin build woman head!");
    }

    @Override
    public void buildBody() {
        System.out.println("begin build woman body!");
    }

    @Override
    public void buildFoot() {
        System.out.println("begin build woman foot!");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
