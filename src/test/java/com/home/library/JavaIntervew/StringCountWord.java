package com.home.library.JavaIntervew;

import java.util.Scanner;

public class StringCountWord {
    /*
    Print out the number of times that the string "hi" appears anywhere in the given string
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str= scan.nextLine();

        int count = 0;
        for(int i=0; i< str.length()-1; i++){
            if(str.substring(i,i+2).equalsIgnoreCase("hi")){
                count++;
            }
        }
        System.out.println(count);

//        //solution 2;
//        int count = 0;
//        str= str.toLowerCase();
//        while (str.contains("hi")) {
//            count++;
//            str = str.replaceFirst("hi", "");
//        }
//        System.out.println(count);
   }
}


