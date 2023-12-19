package com.himanshu.dsa;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr,int si,int ei){
        if(si<ei){
            int lo=si;
            int hi=ei;
            int mid=lo+(hi-lo)/2;
            int pivot=arr[mid];

            while (lo<=hi){
                while (arr[lo]<pivot)
                    lo++;

                while (arr[hi]>pivot)
                    hi--;

                if (lo<=hi){
                    int temp=arr[lo];
                    arr[lo]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    lo++;
                }

            }
            quickSort(arr,si,hi);
            quickSort(arr,lo,ei);
        }
    }

    public static void main(String[] args) {
//        int[] arr ={7,3,8,4,5,6,1};
        int arr[]= {10,5,3,6,4,9,2,14,1,8};
        quickSort(arr,0,arr.length-1);
        System.out.println("Quick Sort");
        System.out.println(Arrays.toString(arr));
    }
}
