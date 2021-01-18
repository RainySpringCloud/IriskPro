package com.spring.irisk.irisk.hashmap;

public class MyService2 extends Thread{

    private MyThread myThread;

    public MyService2(MyThread myThread){
        this.myThread =myThread;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
           // myThread.map.put("ThreadB" + (i + 1) ,"ThreadB" + i + 1);
            myThread.conMap.put("ThreadB" + (i + 1) ,"ThreadB" + i + 1);
            System.out.println("ThreadB"+(i+1));
        }

    }
}
