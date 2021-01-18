package com.spring.irisk.irisk.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

public class ArrayListThread {

    //验证arraylist 线程不安全
    public static void main(String[] args) {
        List<String> adds = new Vector<>();
        for(int i = 0;i<30;i++){
            new Thread(()->{
                adds.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(adds);

            },String.valueOf(i)).start();
        }

    }

}
