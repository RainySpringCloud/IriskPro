package com.spring.irisk.irisk.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread  implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {

        System.out.println("111233444");
        Thread.sleep(3000);
        return 4396;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //构造方法
        FutureTask<Integer> ft = new FutureTask<Integer>(new CallableThread());
        Thread t1 = new Thread(ft,"aaa");

        t1.start();
        //阻塞main线程 建议放最后
        //int count  = ft.get();
        System.out.println(Thread.currentThread().getName());

        //
        int count = 0;
        while(!ft.isDone()){
           count  = ft.get();
        }

        System.out.println("result + " + count);

    }
}
