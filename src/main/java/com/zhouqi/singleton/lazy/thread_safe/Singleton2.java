package com.zhouqi.singleton.lazy.thread_safe;

public class Singleton2 {//静态内部类 既实现了线程安全，又避免了同步带来的性能影响
    private static class LazyHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    private Singleton2 (){}
    public static final Singleton2 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
