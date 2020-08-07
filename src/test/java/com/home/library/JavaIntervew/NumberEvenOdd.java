package com.home.library.JavaIntervew;

public class NumberEvenOdd {
    public static void main(String[] args) {
        System.out.println(EvenOdd(32));
    }

    public static String EvenOdd(int num){

        return num%2==0 ? "Even" : "Odd";
    }

}
