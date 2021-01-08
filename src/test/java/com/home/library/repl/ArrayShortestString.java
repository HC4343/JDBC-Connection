package com.home.library.repl;

public class ArrayShortestString {

    public static void main(String[] args) {

        String [] arr= {"java", "cable", "red", "remedy", "grace"};

        int index=0;
        int min =9999;
        for (int i=0; i<arr.length; i++){
            if (arr[i].length()<min){
                min=arr[i].length();
                index=i;
            }
        }
        System.out.println(arr[index]);

    }


}
