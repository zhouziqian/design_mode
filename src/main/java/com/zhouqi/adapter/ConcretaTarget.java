package com.zhouqi.adapter;
// 具体目标类，只提供普通功能
public class ConcretaTarget implements Target {
    @Override
    public void request() {
        System.out.println("Adaptee has common request");
    }
}
