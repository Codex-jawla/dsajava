package com.pratice;

import java.util.Arrays;

public class mergeSort {

    public static void mergesort(int arr[],int st,int end){
        divide(arr, st, end);
    }

    public static void divide(int arr[],int st,int end){
        if (st<end){
            int mid = (end+st)/2;
            divide(arr,st,mid);
            divide(arr, mid+1,end);
            merge(arr,st,mid,end);
        }
    }
    public static void merge(int arr[],int st,int mid,int end){
        int n1=st;
        int n2=mid+1;
        int ar[]=new int[arr.length];
        int x=st;
        while (n1<=mid&&n2<=end){
            if (arr[n1]<arr[n2]){
                ar[x]=arr[n1];
                n1++;
                x++;
            }else{
                ar[x]=arr[n2];
                n2++;
                x++;
            }
        }
        while (n1<=mid){
            ar[x]=arr[n1];
            n1++;
            x++;
        }
        while (n2<=end){
            ar[x]=arr[n2];
            n2++;
            x++;
        }
        for (int i=st;i<=end;i++){
            arr[i]=ar[i];
        }
    }


    public static void main(String[] args) {
    int arr[]= {10,5,3,6,4,9,2,14,1,8};
    mergesort(arr,0, arr.length-1);
        System.out.println("Merge Sort");
        System.out.println(Arrays.toString(arr));


    }
}
