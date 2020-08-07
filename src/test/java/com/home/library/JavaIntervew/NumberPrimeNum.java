package com.home.library.JavaIntervew;

public class NumberPrimeNum {

    public static void main(String[] args) {

        System.out.println(PrimeNum(7));

    }

    public static boolean PrimeNum(int num){

        boolean result = true;

        if (num<=1){
            return false;
        }

        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return result;

    }


}
