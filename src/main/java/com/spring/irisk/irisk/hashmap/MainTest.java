package com.spring.irisk.irisk.hashmap;

import java.util.concurrent.CopyOnWriteArrayList;

public class MainTest {



    public static void main(String[] args) {

        //线程安全的arrayList
        CopyOnWriteArrayList<String> cowa = new CopyOnWriteArrayList<>();
        cowa.add("sss");
        cowa.add("aaa");
        cowa.add("ddd");
        cowa.add("fff");
        cowa.add("ggg");
        cowa.add("hhh");
        cowa.add("jjj");
        cowa.forEach(s->{
            System.out.println(s);
        });

//        MyThread myThread = new MyThread();
//
//        MyService1 m1 = new MyService1(myThread);
//        MyService2 m2 = new MyService2(myThread);
//        m1.start();
//        m2.start();

    }
}
