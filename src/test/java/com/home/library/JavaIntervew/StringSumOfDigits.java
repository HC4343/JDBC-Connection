package com.home.library.JavaIntervew;

public class StringSumOfDigits {
    public static void main(String[] args) {
        String str = "235";
        SumOfDigits(str);
    }

    public static void SumOfDigits(String str){

        int total =0;
        char[] ch = str.toCharArray();

        for (char each : ch){
            total +=Integer.valueOf(""+each);
        }
        System.out.println(total);
    }
}
