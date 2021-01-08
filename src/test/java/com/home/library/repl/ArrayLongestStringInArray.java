package com.home.library.repl;

import java.util.Scanner;

public class ArrayLongestStringInArray {

    public static void main(String[] args) {
       //soru; en uzun string hangisi??
        Scanner scan = new Scanner(System.in);
        String[] words = new String[4];

        for (int i=0; i<4; i++){
            words[i]=scan.nextLine();
        }
       // String[] words = { "aa","kkkkkkkkkkkkkkkkkkkk","ssss", "fffffff", };

        int index =0;
        int lengthElm =0;
        for (int i=0; i<words.length; i++){
            if (words[i].length()>lengthElm){
                lengthElm =words[i].length();
                index=i;
            }
        }
        System.out.println(words[index]);






    }



}
