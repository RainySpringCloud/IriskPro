package com.spring.irisk.irisk.hashmap;

public class MyService1 extends Thread {

    private MyThread myThread;

    public MyService1(MyThread myThread){
        this.myThread =myThread;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
           // myThread.map.put("ThreadA" + (i + 1) ,"ThreadA" + i + 1);
            myThread.conMap.put("ThreadA" + (i + 1) ,"ThreadA" + i + 1);
            System.out.println("ThreadA"+(i+1));
        }

    }
}
