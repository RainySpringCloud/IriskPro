package com.spring.irisk.irisk.pro.test;

import org.openjdk.jol.info.ClassLayout;

public class Test01 {

    public static void main(String[] args) {
        Object obj = new Object();
        //打印对象头信息
       // obj.hashCode();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj){
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }
    }
}
