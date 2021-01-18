package com.spring.irisk.irisk.thread.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {

    //读写锁的使用 不添加synchronize重量级锁
    public volatile  Map<String,Object> map = new HashMap<>();

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        ReentrantReadWriteLockTest reentrantReadWriteLockTest = new ReentrantReadWriteLockTest();

            for(int i = 0;i<5;i++){
                final int flag = i;
                new Thread(()->{
                reentrantReadWriteLockTest.put1(String.valueOf(flag),flag);
                },String.valueOf(i)).start();
            }
            for(int i=0;i<5;i++){
                final int flag = i;
                new Thread(()->{
                    try {
                        reentrantReadWriteLockTest.get1(String.valueOf(flag));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                },String.valueOf(i)).start();
            }
    }

    //必须要加锁 完成synchronized
    public  synchronized void put(String str,Object obj)  {


        System.out.println(Thread.currentThread().getName() + "  正在写入操作 " + str);

        map.put(str,obj);
        System.out.println(Thread.currentThread().getName() + "  完成写入操作 ");

    }

    public void get(String str) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "  正在读取操作 ");
        Object o  = map.get(str);
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "  读取完成 " + o.toString() );
    }

    public  void put1(String str,Object obj)  {

    lock.writeLock().lock();
    try{
        System.out.println(Thread.currentThread().getName() + "  正在写入操作 " + str);

        map.put(str,obj);
        System.out.println(Thread.currentThread().getName() + "  完成写入操作 ");
    }catch (Exception e){
        e.printStackTrace();
    }finally {
         lock.writeLock().unlock();
    }




    }

    public void get1(String str) throws InterruptedException {
    lock.readLock().lock();
    try{
        System.out.println(Thread.currentThread().getName() + "  正在读取操作 ");
        Object o  = map.get(str);
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + "  读取完成 " + o.toString() );

    }catch (Exception e){
        e.printStackTrace();
    }finally {
        lock.readLock().unlock();
    }
    }


}
