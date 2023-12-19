package com.himanshu.dsa;

public class recursionBinarySearch {

    static int recBS(int[] arr,int start,int end,int target){
        if (start>end)
            return -1;
        int mid=start+(end-start)/2;
        if (target==arr[mid])
            return mid;
        if (target<arr[mid])
            return recBS(arr,start,mid-1,target);
        else
            return recBS(arr,mid+1,end,target);
    }

    public static void main(String[] args) {

        int[] arr={0,3,5,12,14,20};
        int ans=recBS(arr,0, arr.length -1,12);
        System.out.println(ans);

    }
}
