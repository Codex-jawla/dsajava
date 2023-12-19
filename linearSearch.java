package com.himanshu.dsa;

import java.util.Arrays;
import java.util.Scanner;


public class linearSearch {

    public static int findmin(int []arr){
        int min =arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int findmax(int []arr){
        int min =arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > min){
                min=arr[i];
            }
        }
        return min;
    }
 public static void linearsearch(int ar[],int val){
     for (int i=0;i<ar.length;i++) {
         if (ar[i] == val){
             System.out.println("Element found at index " + i);
         return;
         }
     }
     System.out.println("Element not found ");
 }
    public static void linearsearch2d(int ar[][],int val){
        for (int i=0;i<ar.length;i++) {
            for (int j=0;j<ar[i].length;j++) {
                if (ar[i][j] == val) {
                    System.out.println("Element found in row " + (i+1)+" and col "+(j+1));
                    return;
                }
            }
        }
        System.out.println("Element not found ");
    }
    public static void linearsearchString(String ar[],String val){
        for (int i=0;i<ar.length;i++) {
            if (ar[i].equals(val)){
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] =new int[]{25,65,35,48,96,52,14,67,23,101,16,9,25,31};
        int[][] arr2d= new int[][]{
                {2,4,6,12},
                {43,3,74,23},
                {56,48,25,36}
        };
        String str[] =new String[]{"hello","vansh","jawla","himanshu","jaat","harsh","mansi","babli","chaudhary","chotu","gudya"};

        System.out.println("Enter element to search in 1d int array : ");
        int a= sc.nextInt();
        linearsearch(arr,a);
        System.out.println("Enter element to search in 2d int array: ");
        int b= sc.nextInt();
        linearsearch2d(arr2d,b);
        System.out.println("Enter name to search in 1d string array: ");
        String s= sc.next();
        linearsearchString(str,s);

        System.out.println("Minimum element in array : "+ findmin(arr));
        System.out.println("Maximum element in array : "+ findmax(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
        System.out.println(15/2);
    }
}
