package com.spring.irisk.irisk.hashmap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread {

    public HashMap<String,String> map = new HashMap<>();
    public ConcurrentHashMap<String,String> conMap = new ConcurrentHashMap<>();

}
