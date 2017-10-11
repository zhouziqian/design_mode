package com.zhouqi.singleton.lazy.thread_safe;

public class Singleton {
    private Singleton(){}
    private static Singleton  single = null;
    public static synchronized Singleton getInstance(){//加上同步关键字
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public static Singleton getInstance2() {//双重锁定检查
        if (single == null) {
            synchronized (Singleton.class) {
                if (single == null) {
                    single = new Singleton();
                }
            }
        }
        return single;
    }
}
