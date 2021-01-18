package com.spring.irisk.irisk.thread.lock;

import java.util.concurrent.atomic.AtomicReference;

public class ReferenceLock {

    //原子引用线程 保证你在修改对象引用时的线程安全性
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){

        Thread thread =  Thread.currentThread();
        //如果是null 设为当前线程 null返回true 不是空则等待自旋 返回false
        System.out.println(Thread.currentThread().getName()+"    muLock"  );
        while(!atomicReference.compareAndSet(null,thread)){

        }

    }

    public void myUnLock(){
        Thread thread = Thread.currentThread();

        //解锁  有线程释放锁

        atomicReference.compareAndSet(thread,null);


        System.out.println(Thread.currentThread().getName() + "    myUnlock");
    }

    public static void main(String[] args) throws InterruptedException {

        //T2必须需要通过自旋的方式来不断的循环访问调用 看是否会有资源
        ReferenceLock referenceLock = new ReferenceLock();

        new Thread(()->{

            try {
                referenceLock.myLock();
                Thread.sleep(5000);
                referenceLock.myUnLock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        Thread.sleep(1000);

        new Thread(()->{
            referenceLock.myLock();
            referenceLock.myUnLock();

        },"t2").start();
    }
}
