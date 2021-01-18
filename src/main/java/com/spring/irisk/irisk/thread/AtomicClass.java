package com.spring.irisk.irisk.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }



}
