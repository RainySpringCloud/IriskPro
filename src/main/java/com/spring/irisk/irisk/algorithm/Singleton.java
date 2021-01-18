package com.spring.irisk.irisk.algorithm;

public class Singleton {

    //饿汉式单例
    private static Singleton singleton = new Singleton();

    public Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

}
