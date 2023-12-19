package com.himanshu.dsa;

import java.util.Arrays;


public class InsertionSort {
    static void swap(int[] ar,int firstidx,int secondidx){
        int temp=ar[firstidx];
        ar[firstidx]=ar[secondidx];
        ar[secondidx]=temp;
    }
    static void insertsort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while (j>0){
                if (arr[j-1]<=arr[j]){
                    break;}
                if (arr[j-1]>arr[j])
                    swap(arr,j-1,j);

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,4,9,3,3,13,10,0};
        int[] ar={1,3,4,5,7,9,10};
        int[] a={6,5,3,2,1,2,1,0};
        System.out.println(Arrays.toString(arr));
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
