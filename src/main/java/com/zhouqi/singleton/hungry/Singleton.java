package com.zhouqi.singleton.hungry;

public class Singleton {
    private static  final  Singleton single = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return single;
    }
}
