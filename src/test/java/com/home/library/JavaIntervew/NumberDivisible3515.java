package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.List;

public class NumberDivisible3515 {
    public static void main(String[] args) {
        /*
        Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
         */

        String s3 = "";
        String s5 = "";
        String s15= "";

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<99; i++){
            list.add(i);
        }
        // List olusturmadan da yapilabilir..........................................
        for(Integer each: list) {
            if(each%15 ==0 && each%5==0 && each%3==0) {
                s15 +=each+" ";
            }else if(each%3==0 && each%15 !=0) {
                s3  +=each+" ";
            }else if (each%5==0 && each%15 !=0) {
                s5  +=each+" ";
            }
        }
        System.out.println("Divisible by 15 and 5 and 3 is " +s15);
        System.out.println("Divisible br 3 not 15 is "+ s3);
        System.out.println("Divisible by 5 not 15 is "+ s5);
    }
}
