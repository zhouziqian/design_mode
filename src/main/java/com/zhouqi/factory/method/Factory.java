package com.zhouqi.factory.method;

public class Factory {
    public Bmw craeteBmw(int type){
        switch (type){
            case 320:
                return new Bmw320();
            case 523:
                return new Bmw523();
            default:
                return null;
        }
    }
}
