package com.home.library.repl;

public class ArrayAddedArrayAndInt {
    // repl 149 --> array'e bir int ekleyerek yeni bir array olusturmak....
    public static void main(String[] args) {

        int [] arr = {3,5,11,6};
        int aa = 3;
        addInt(arr, aa);
    }

    public  static void addInt( int[] arr, int num){

        int [] result = new int[arr.length+1];

        int i=0;//index numbers
        for (int each : arr){
           result[i]=each;
           i ++;
        }
        result[i]=num;

        for (int each : result){
            System.out.println(each);
        }



    }


}
