package com.home.library.repl;

public class StringNumberOfAppearence {

    public static void main(String[] args) {

        // soru; java ile python sayisi birbirine esit mi degil mi???

        String str = " Java is like Python";

        int count1=0;
        int count2=0;
        for(int i=0; i< str.length()-3; i++){
            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                count1 ++;
            }
        }
        for (int i=0; i<str.length()-5; i++){
            if (str.substring(i,i+6).equalsIgnoreCase("python")){
                count2 ++;
            }
        }
        System.out.println(count1==count2 ? true :false);





    }




}
