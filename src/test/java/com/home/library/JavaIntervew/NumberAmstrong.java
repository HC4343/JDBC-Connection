package com.home.library.JavaIntervew;

public class NumberAmstrong {
    public static void main(String[] args) {
         /*
        Task 2:
        Create a method that will accept a number and check if the number is an Armstrong number.
        If the number is an Armstrong number return true otherwise return false.
         */

        //153= 1^3+5^3+3^3
        System.out.println(isAmstrong(153));
    }


    public static boolean isAmstrong(int x){

        String number = String.valueOf(x);

        int power = number.length();   //pow methodu icin power lazim

        int sum =0;

        for( int i=0; i<number.length(); i++){
            int digit = Integer.parseInt(""+number.charAt(i));       //pow methodu icin digit lazim
                                                                       // bir de int e donusturmek lazim, wrapper clas'tan
            sum +=Math.pow(digit, power);
        }

        return sum == x;

    }
}
