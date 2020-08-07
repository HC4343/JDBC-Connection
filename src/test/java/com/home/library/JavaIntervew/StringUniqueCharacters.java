package com.home.library.JavaIntervew;

public class StringUniqueCharacters {
    public static void main(String[] args) {
    //solution 1;
        String str1 = "WWWWqqqhjk";
        System.out.println(Unique(str1));

    }

    public static String Unique(String str){

        String[] arr = str.split("");

        String Unique="";
        for(int i=0; i<arr.length; i++) {
            int count=0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    count ++;
                }
            }
            if(count==1) {
                Unique +=arr[i];
            }
        }
        return Unique;

    }
    //		Solution 2:
//
//			public static String Unique(String str) {
//
//			String result ="";
//
//			for(String each : str.split(""))
//
//			result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
//
//
//
//			return result;
//
//			}








}
