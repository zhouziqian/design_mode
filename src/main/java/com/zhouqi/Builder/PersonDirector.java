package com.zhouqi.Builder;

public class PersonDirector {
    public Person constructPerson(PersonBuilder pd){
        pd.buildHead();
        pd.buildBody();
        pd.buildFoot();
        return pd.buildPerson();
    }
}
