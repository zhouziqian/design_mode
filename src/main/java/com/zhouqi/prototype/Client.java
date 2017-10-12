package com.zhouqi.prototype;

public class Client {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
//        for(int i=0; i< 10; i++){
//            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
//            clonecp.show();
//        }
        ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
        System.out.println(cp==clonecp);//false
    }
}
