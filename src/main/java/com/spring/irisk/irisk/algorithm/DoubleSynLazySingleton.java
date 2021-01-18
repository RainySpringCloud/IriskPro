package com.spring.irisk.irisk.algorithm;

public class DoubleSynLazySingleton {

    //双重检测锁单例模式
    private static volatile DoubleSynLazySingleton doubleSynLazySingleton = null;

    public DoubleSynLazySingleton(){

        System.out.println("kkk");

    }

    public static DoubleSynLazySingleton getInstance(){
        if(null == doubleSynLazySingleton){
            synchronized (DoubleSynLazySingleton.class){
                if(null==doubleSynLazySingleton){
                    doubleSynLazySingleton = new DoubleSynLazySingleton();
                }
            }
        }
        return doubleSynLazySingleton;
    }

    public static void main(String[] args) {
        //DoubleSynLazySingleton doubleSynLazySingleton = new DoubleSynLazySingleton();

        for(int i=0;i<10;i++){
            new Thread(()->{

                DoubleSynLazySingleton.getInstance();
            },String.valueOf(i)).start();

        }
    }
}
