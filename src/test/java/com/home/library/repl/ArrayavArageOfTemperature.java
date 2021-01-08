package com.home.library.repl;

public class ArrayavArageOfTemperature {


    //soru; int'lerin ortalamasi..
    public static void main(String[] args) {

        int [] temp = {80, 88, 88, 84, 82, 78, 60, 68};

        double total=0;
        for (int each: temp){
            total +=each;
        }
        System.out.println(total/temp.length);


    }



}
