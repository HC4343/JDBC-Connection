package com.home.library.JavaIntervew;

public class StringSumONumsTogetherLetters {
    public static void main(String[] args) {

        String str = "eee3Frg45KOL";

        String nums = "";
        int sum = 0;
        for(int i =0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                nums +=str.charAt(i);
                if (i==str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum +=Integer.parseInt(nums);
                    nums = "";
                }
            }
        }

        System.out.println(sum);
    }
}

