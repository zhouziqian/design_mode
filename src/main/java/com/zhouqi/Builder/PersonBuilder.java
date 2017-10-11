package com.zhouqi.Builder;

public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();

    Person buildPerson();
}
