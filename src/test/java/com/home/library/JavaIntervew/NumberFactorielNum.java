package com.home.library.JavaIntervew;

public class NumberFactorielNum {

    /*
     Write a return method that returns the factorial number of any given number
       Ex:
         Input: 5
         outPut: 120
          2!=2*1=2
          3!=3*2*1=6
          4!=4*3*2=24
          5!=5*4*3*2*1=120
     */
    public static void main(String[] args) {

        System.out.println(Factoriel(5));
    }

    public static int Factoriel(int num){

        int result = 1;
        for(int i=1; i<=num; i++){
            result= result*i;
        }

        return result;

    }



}
