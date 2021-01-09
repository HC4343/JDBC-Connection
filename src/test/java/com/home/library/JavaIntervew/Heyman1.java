package com.home.library.JavaIntervew;

import java.util.Scanner;

public class Heyman1 {

    /*
    Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console. Please, get the input from user.

     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = sc.nextLine();
        //word = word.trim();

        int lng = word.length();

        String reverse = "";

        if (lng == 5) {
            char[] ch = word.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                reverse += ch[i];
            }
            System.out.println("Reverse word: " + reverse.trim());
        } else {
            if (lng < 5)
                System.out.println("Too short");
            else
                System.out.println("Too long");
        }
    }

}
