package com.zhouqi.proxy;

public class Test {
    public static void main(String[] args) {
        People people1 = new People();
        people1.setCash(60000);
        people1.setUsername("jeck");


        People people2 =new People();
        people2.setCash(40000);
        people2.setUsername("rose");

        People people3 =new People();
        people3.setCash(0);
        people3.setUsername("tom");
        people3.setVip("vip");

        ProxyClass proxyClass = new ProxyClass();
        proxyClass.setPeople(people1);
        proxyClass.buyCar();
        proxyClass.setPeople(people2);
        proxyClass.buyCar();
        proxyClass.setPeople(people3);
        proxyClass.buyCar();
    }
}
