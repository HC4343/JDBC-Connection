package com.home.library.repl;

public class ArrayStringReverseOrder {
    //soru ;1- fun  --> sekline getir..
    //         is
    //         java

    //      2-fun is java--> sekline getir
    public static void main(String[] args) {
        String str = "Java is fun";

        String reversed ="";
        String[] arr = str.split(" ");

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);

            reversed +=arr[i]+" ";
        }
        System.out.println(reversed);
    }



}
