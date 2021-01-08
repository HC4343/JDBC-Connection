package com.home.library.repl;

public class ArrayCountSameStringInArray {

    public static void main(String[] args) {

        String[] arr1 = {"java", "java", "hi", "python", "python", "java"};
        String str1 = "hi";
        System.out.println(countSameString(arr1,str1));
    }
    public static int countSameString(String[] arr, String str){

        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].equalsIgnoreCase(str)){
                count ++;
            }
        }
        return count;

    }

}
