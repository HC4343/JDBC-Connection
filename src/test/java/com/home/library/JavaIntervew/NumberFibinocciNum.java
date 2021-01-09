package com.home.library.JavaIntervew;

public class NumberFibinocciNum {
     //Write a return method that returns the  Fibonacci of any given number
    //rakam kendisinden iki oncekinin toplami ise fibonacci dir
     public static void main(String[] args) {
         System.out.println(Fibinocci(3));
     }

     public static int Fibinocci(int num){

         int result =0;
         int a =0;
         int b =1;
         for( int i=0; i<num; i++){//???????
             result =a+b;
             a=b;
             b=result;
         }

         return result;

     }




}
