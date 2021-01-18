package com.spring.irisk.irisk.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPool {

    public static void main(String[] args) {
        //固定线程数
        //ExecutorService threadPool = Executors.newFixedThreadPool(5);
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        //一池N个线程处理

        //ExecutorService threadPool = Executors.newCachedThreadPool();

        try{
            //执行业务
            for(int i=0;i<10;i++){


                threadPool.execute(()->{
                    System.out.println( Thread.currentThread().getName() + "   业务");
                });
            }
            //submit 可以选择是否有返回值
            //threadPool.submit();

        }catch (Exception e){

        }finally {
            threadPool.shutdown();
        }
    }
}
