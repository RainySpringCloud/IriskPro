package com.spring.irisk.irisk.hashmap.writemap;



public class MyHashMap<K,V> implements MyMap<K,V>{

    private int DEFAULT_LENGTH = 16;

    private float LOADER = 0.75f;

    private int useSize = 0;

    private Entry<K,V>[] table;

    public MyHashMap(){
        this(16,0.75f);
    }

    public MyHashMap(int defaultLength, float loader){
        if(defaultLength<0){
            throw new IllegalArgumentException("数组异常");
        }
        if(loader<=0 || Float.isNaN(loader)){
            throw new IllegalArgumentException("装载因子异常");
        }
        this.DEFAULT_LENGTH = defaultLength;
        this.LOADER = loader;
        table = new Entry[DEFAULT_LENGTH];
    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public V put(K k, V v) {
        return null;
    }

    //内部类 Entry HashMap的存储结构
    class Entry<K,V> implements MyMap.Entry<K,V>{

        private K key;

        private V value;

        private Entry<K,V> next;

        public Entry(K k,V v,Entry<K,V>entry){

            this.key = k;
            this.value = v;
            this.next = entry;

        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public K getKey() {
            return key;
        }
    }
    //移位运算符   无符号右移位运算符 二进制位 往后移动两位 不带符号
    private int hash(int hashCode){
        hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>>12));
        return hashCode ^ ((hashCode >>> 7) ^ hashCode >>> 4);
    }

    private int getIndex(K k,int length){
        int m = length -1;
        int index =hash(k.hashCode()) & m;
        return index>=0 ? index : -index;
    }
}