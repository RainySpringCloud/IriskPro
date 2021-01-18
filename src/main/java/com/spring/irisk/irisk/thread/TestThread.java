package com.spring.irisk.irisk.thread;

public class TestThread {

    private volatile   static int si = 0;
    public void count(){
        si++;
    }

    public static void main(String[] args) throws InterruptedException {

//        ThreadOne one = new ThreadOne("aaa");
//        ThreadOne two = new ThreadOne("bbb");
//        ThreadOne three = new ThreadOne("ccc");
//        one.start();
//        three.start();
//        two.start();
        TestThread t1 = new TestThread();

        AtomicClass ac = new AtomicClass();
        System.out.println("count1 "  + ac.atomicInteger);
        for(int i=0;i<10;i++){
            new Thread(()->{
                for(int j = 0;j<1000;j++){
                    //t1.count();
                    ac.addAtomic();
                }

            },String.valueOf(i)).start();
        }

       // Thread.sleep(1);

        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println("count "  + ac.atomicInteger);
    }
}
