package com.home.library.repl;

public class stringCountCatDog {

    public static void main(String[] args) {
        String word ="cat123dlkmDog";
        int count1=0;
        int count2=0;
        for (int i =0; i<word.length()-2; i++){
            if (word.substring(i,i+3).equalsIgnoreCase("cat")){
                count1 ++;
            }
            if (word.substring(i,i+3).equalsIgnoreCase("dog")){
                count2 ++;
            }
        }
        System.out.println((count1==count2) ? true : false);


    }


}
