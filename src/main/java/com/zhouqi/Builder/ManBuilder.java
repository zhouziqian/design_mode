package com.zhouqi.Builder;

public class ManBuilder implements PersonBuilder {
    Person person;
    public ManBuilder() {
        person=new Man();
    }

    @Override
    public void buildHead() {
        System.out.println("begin build man head!");
    }

    @Override
    public void buildBody() {
        System.out.println("begin build man body!");
    }

    @Override
    public void buildFoot() {
        System.out.println("begin build man foot!");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
