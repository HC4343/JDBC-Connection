package com.home.library.JavaIntervew;

import java.util.Arrays;

public class StringPassword2 {

    public static void main(String[] args) {
        String str1 = "pgy34_dPP";
        System.out.println(Username(str1));
    }
    public static boolean Username(String str) {
        boolean length = str.length() >= 4;
        boolean lowerCase = str.matches(".*[a-z].*");
        boolean upperCase = str.matches(".*[A-Z].*");
        boolean digits = str.matches(".*[0-9].*");
        boolean start = Character.isAlphabetic(str.charAt(0));
        boolean end = !str.endsWith("_");
        boolean contain =true;
        if (str.contains("_")) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i,i+1).equalsIgnoreCase("_")){
                //if (str.charAt(i) == Character.valueOf('_')) {
                    count++;
                }
            }

            if (count == 1) {
                contain = true;
            } else {
                contain = false;
            }
        }

        boolean valid = length && lowerCase && upperCase && digits && start && end && contain;
        return valid ? true : false;
    }
}