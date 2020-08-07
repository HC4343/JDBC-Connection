package com.home.library.JavaIntervew;

import java.util.Arrays;

public class ArrayToConcatTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,5};
        int[] arr2 = {1,2,10};
        System.out.println(Arrays.toString(concat2Array(arr1,arr2)));
    }

    public static int [] concat2Array(int[] arr1, int[] arr2){

        int[] arr = new int[arr1.length+arr2.length];

        int i =0;
        for(int each : arr1){
            arr[i]= each;
            i++;
        }
        for (int each : arr2){
            arr[i] = each;
            i++;
        }

        return arr;
    }
}
