package com.home.library.repl;

import java.util.Scanner;

public class ArrayIfContainsCertainLetterPrint {

    //soru: icinde e harfi olan string'leri konsola al..
    public static void main(String[] args) {

        String[] words = {"Abe", "klm", "erte", "oeeopj"};

        int count=0;
        for (int i=0; i<words.length; i++){
            if (words[i].contains("e")){
                count ++;
            }
        }

        int index=0;
        String[] fewValues=new String[count];
        for (int i=0; i<words.length; i++){
            if (words[i].contains("e")){
                fewValues[index ++] = words[i];
            }
        }
        for (String each : fewValues){
            System.out.println(each);
        }

    }
}
