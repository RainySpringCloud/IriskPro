package com.spring.irisk.irisk.hashmap.writemap;

public interface MyMap<K,V> {

    V get(K k);

    V put(K k,V v);

    interface Entry<K,V>{
        V getValue();

        K getKey();
    }
}
