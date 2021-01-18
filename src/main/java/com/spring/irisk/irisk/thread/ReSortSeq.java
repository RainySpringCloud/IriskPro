package com.spring.irisk.irisk.thread;

public class ReSortSeq {

     int a =0;
     boolean flag = false;
    public void method1(){
        a = 1;
        flag = true;
    }
    public void method2(){
        if(flag){
            a = a+10;
            if(a==10){
                System.out.println("aaa is " +a);
            }
        }
    }

    public static void main(String[] args) {
        ReSortSeq rs = new ReSortSeq();



        for(int i=0;i<10;i++){
            new Thread(()->{
                rs.method1();
                rs.method2();
            },String.valueOf(i)).start();

        }



    }
}
