package com.himanshu.dsa;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            boolean swap=false;
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap=true;
                }
            }
            if (!swap)
               break;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,4,9,3,3,13,10,0};
        int[] ar={1,3,4,5,7,9,10};
        int[] a={6,5,4,3,2,1,2,1,0};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
