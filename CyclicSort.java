package com.himanshu.dsa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {

    static void cyclicsort(int[] arr){//    >>>>> 1 to n >>>>>>
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                i--;
            }
        }
    }
    static void cyclicsort1(int[] arr){//    >>>>> 0 to n >>>>>>
        int i=0;
        while (i<arr.length) {
            if (arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }else
                i++;
        }
    }
    static int missing(int[] arr){//    >>>>> 0 to n >>>>>>
        int i=0;
        while (i<arr.length) {
            if (arr[i] != i) {
                if (arr[i]== arr.length) {
                    i++;
                    continue;
                }else{int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;}
            }else
                i++;
        }
        i=0;
        while (i< arr.length){
            if (arr[i]==i)
                i++;
            else {
//                System.out.println("Missing element is : " + i);
                break;
            }
        }
        return i;
    }
    static List<Integer> missingMulti(int[] arr){//    >>>>> 1 to n >>>>>>
        int i=0;
        ArrayList<Integer> l=new ArrayList<>();
        while (i<arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
            }else
                i++;
        }
        i=0;
        while (i< arr.length){
            if (arr[i]==i+1)
                i++;
            else {
                l.add(i+1);
                i++;
            }
        }
        return l;
    }

    static List<Integer> duplicate(int[] arr){//    >>>>> 1 to n >>>>>>
        ArrayList<Integer> l=new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                i--;
            }
        }
        int i=0;
        while (i< arr.length){
            if (arr[i]==i+1)
                i++;
            else {
                l.add(arr[i]);
                i++;
            }
        }
        return l;
    }
    static int [] setMismatch(int[] arr){//    >>>>> 1 to n >>>>>>
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                i--;
            }
        }
        int i=0;
        while (i< arr.length){
            if (arr[i]==i+1)
                i++;
            else {
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static int firstMissingPositve(int[] arr){
        int i=0;
        while (i<arr.length) {
            if (arr[i]<1){
                i++;
                continue;
            } else if (arr[i]>=arr.length) {
                i++;
                continue;
            } else if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }else
                i++;
        }
         i=0;
        while (i< arr.length){
            if (arr[i]==i+1)
                i++;
            else {
                return i+1;
            }
        }
        return arr.length+1;
    }


    public static void main(String[] args) {
    int[] a={6,8,4,7,2,5,1,0,3};
    int[] b={6,8,7,1,5,3,3,5};
    int[] c={1,1};
    int[] d={3,1,3,0,4,2};
    int[] e={7,8,1,9,10,11};
    int[] f={1,2};
    int l = firstMissingPositve(f);
    System.out.println(l);

//    System.out.println(Arrays.toString(setMismatch(d)));
//    int n =duplicate(d);
//    System.out.println(n);
//    List<Integer> list=new ArrayList<>();
//    list=missingMulti(b);
//    System.out.println(list);
//    cyclicsort1(a);
//    int m=missing(b);
//    System.out.println(m);
    }
}
