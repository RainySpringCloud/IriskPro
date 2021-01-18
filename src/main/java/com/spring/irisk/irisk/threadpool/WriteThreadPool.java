package com.spring.irisk.irisk.threadpool;

import java.util.concurrent.*;

public class WriteThreadPool {

    //手写线程池
    public static void main(String[] args) {
        //给队列赋予初始值 不为最大值
        ExecutorService es = new ThreadPoolExecutor(
                2,
                5,
                1000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }


}
