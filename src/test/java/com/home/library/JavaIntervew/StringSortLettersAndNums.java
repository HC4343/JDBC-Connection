package com.home.library.JavaIntervew;

import java.util.Arrays;

public class StringSortLettersAndNums {
    //	Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    //	sort the individual string and append them back together
    //	Input:  "DC501GCCCA098911"
    //	OutPut: "CD015ACCCG011899"

    public static void main(String[] args) {

        System.out.println(sortEach("501DCGCCCA098911"));

    }

    public static String sortEach(String str) {

        String sorted = "";
        String each = "";

        for(int i=0; i < str.length(); i++) {
            each += str.charAt(i);
            if(Character.isLetter(str.charAt(i))){
                if(i == str.length()-1 || !Character.isLetter(str.charAt(i+1))){
                    sorted += sortSubstring(each);
                    each = "";
                }

            } else {
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
                    sorted += sortSubstring(each);
                    each = "";
                }
            }
        }
        return sorted;
    }

    private static String sortSubstring(String str) {
        String [] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replace("[", "")
                .replace("]","").replace(", ", "");

    }
}
