package com.spring.irisk.irisk.thread;

public class ThreadOne extends Thread {

    public   static int i = 99;



    private String name;

    public ThreadOne(String name){
        ThreadOne.currentThread().setName(name);
        //this.name = name;
    }

    @Override
    public   void run() {
        super.run();

        synchronized(ThreadOne.class){
            for(int s = 0;s<20;s++){
                i = i-1;
                System.out.println(Thread.currentThread().getName() + "   "  +  i);
            }
        }






    }
}
