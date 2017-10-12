package com.zhouqi.adapter;

public class Client {
    public static void main(String[] args) {
        //类适配器测试
        // 使用普通功能类
        Target concreteTarget  = new ConcretaTarget();
        concreteTarget .request();
        // 使用特殊功能类，即适配类
        Target adapter  =new Adapter();
        adapter .request();

        //对象适配器测试
        Target objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();
    }
}
