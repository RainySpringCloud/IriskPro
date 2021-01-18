package com.spring.irisk.irisk.algorithm;

public class LazySingleton {

    //懒汉式单例
    private static LazySingleton lazySingleton = null;

    public LazySingleton(){

    }

    public static LazySingleton getInstance(){

        if(lazySingleton == null){
            lazySingleton  = new LazySingleton();
        }
        return lazySingleton;

    }


}
