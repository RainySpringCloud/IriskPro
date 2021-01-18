package com.spring.irisk.irisk.algorithm;

public class QuickSort {

    public static void sort(int a[],int front,int end){

        if(front<end){
            int flag = end;
            int temp = a[flag];
            int p = front;
            int q = end;

            while(p<q){
                if(a[p]<=temp && p<q){
                    p++;
                }
                a[q] = a[p];
                if(a[q]>=temp && p<q){
                    q--;
                }
                a[p] = a[q];
            }
            int mid =q;
            a[p] = temp;

            sort(a,front,mid-1);
            sort(a,mid+1,end);

        }

    }


    public static void main(String[] args) {
        int a[] ={3,58,15,9,24,78};
        //数组 0 数组长度
        sort(a,0,a.length-1);
        for(int i= 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
