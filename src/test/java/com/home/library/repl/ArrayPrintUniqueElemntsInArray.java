package com.home.library.repl;

import java.util.Arrays;

public class ArrayPrintUniqueElemntsInArray {
    public static void main(String[] args) {
        // unique olanlari konsola al....
        int[] arr ={2, 5, 5, 6, 3, 6, 34, 3};

        //int count =0;
        for (int i=0; i<arr.length; i++){
            int count =0;
            for (int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }








    }
}
