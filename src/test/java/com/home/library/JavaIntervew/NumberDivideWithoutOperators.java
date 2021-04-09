package com.home.library.JavaIntervew;

public class NumberDivideWithoutOperators {

    public static void main(String[] args) {

        Divides(13,5);
    }

    public static void Divides(int a1, int a2){

        if(a2<=0){
            System.out.println("invalid entry");
            return;
        }
        int count =0;
        while (a1>=a2){
//            a1 -=a2;
            a1 = a1 - a2;
            count ++;
        }
        System.out.println("a1 divided by a2 result is " +count +" remainder is "+ a1);



    }




}
