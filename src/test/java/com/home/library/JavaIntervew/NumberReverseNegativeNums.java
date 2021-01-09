package com.home.library.JavaIntervew;

public class NumberReverseNegativeNums {
    //Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        int a= -234;
        System.out.println(reverseNum(a));
    }

    public static int reverseNum(int num){
        //int a=0;
        String str = new StringBuilder(""+num).reverse().toString();
        if(num<0){
            str ="-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }

}
