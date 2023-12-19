package com.himanshu.dsa;

import java.util.Arrays;

public class SelectionSort {
    static void seletsort(int[] ar){
        boolean swap=false;
        for (int i=0;i<ar.length;i++){
            int small=i;
            for (int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[small]) {
                    small = j;
                    swap = true;
                }
            }
            if (swap){
                int temp=ar[i];
                ar[i]=ar[small];
                ar[small]=temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={1,4,4,9,3,3,13,10};
        int[] ar={1,3,4,5,7,9,10};
        int[] a={6,5,4,3,2,1,2,1,0};
        System.out.println(Arrays.toString(arr));
        seletsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
