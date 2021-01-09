package com.home.library.JavaIntervew;

public class NumberSwap {

    public static void main(String[] args) {

        int x =4;
        int y =5;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swaping:  " + "x= "+ x + ",  y= "+ y);
    }



}
