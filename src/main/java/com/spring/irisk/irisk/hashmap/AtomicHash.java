package com.spring.irisk.irisk.hashmap;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicHash  extends Thread{

    private static AtomicInteger ai = new AtomicInteger();
    private static HashMap<String,Integer> map = new HashMap<>();
    @Override
    public void run() {
        super.run();
        while(ai.get()<500000){
            map.put("Map"+ ai.get(),ai.get());
            ai.incrementAndGet();
        }
    }
}
