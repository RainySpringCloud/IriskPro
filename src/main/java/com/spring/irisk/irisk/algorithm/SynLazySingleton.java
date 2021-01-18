package com.spring.irisk.irisk.algorithm;

public class SynLazySingleton {

    //懒汉式单例加锁
    private static SynLazySingleton instance = null;

    public SynLazySingleton(){

    }

    public static synchronized   SynLazySingleton getInstance(){
        if(instance == null){
            instance = new SynLazySingleton();

        }
        return instance;
    }
}
