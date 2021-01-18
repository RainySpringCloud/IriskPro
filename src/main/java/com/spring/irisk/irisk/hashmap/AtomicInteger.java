package com.spring.irisk.irisk.hashmap;

public class AtomicInteger  {

    //HashMap 出现死循环实例
    public static void main(String[] args) {
        AtomicHash ah = new AtomicHash();
        AtomicHash ah2 = new AtomicHash();
        AtomicHash ah3 = new AtomicHash();
        AtomicHash ah4 = new AtomicHash();
        AtomicHash ah5 = new AtomicHash();
        ah.start();
        ah2.start();
        ah3.start();
        ah4.start();
        ah5.start();
    }
}
