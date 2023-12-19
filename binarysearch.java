package com.himanshu.dsa;

public class binarysearch {

    public static void binarys(int ar[],int val){
        int lo=0;
        int hi=ar.length;

        while (hi>lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                System.out.println("Element found at index : "+mid);
                return;
            }
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
            if (hi<lo)
                System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,4,6,9,11,12,14,20,36,44};
        binarys(arr,15);


    }
}
