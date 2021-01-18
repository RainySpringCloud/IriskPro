package com.spring.irisk.irisk.algorithm;

public class QuickSort2 {

    public static void sort(int a[],int front,int end ){

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
                if(a[q]>=temp && p<q ){
                    q--;
                }
                a[p]=a[q];
            }

            int mid = q;
            a[p] = temp;

            sort(a,0,mid-1);
            sort(a,mid+1,end);
        }


    }

    public static void main(String[] args) {
        int a[] ={78,1,45,2,43,99,14,65};
        sort(a,0,a.length-1);
        for(int i = 0;i<a.length-1;i++){
            System.out.println(a[i]);
        }

    }

}
