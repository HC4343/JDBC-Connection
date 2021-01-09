package com.home.library.JavaIntervew;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayPermutationCombination {
    //Given an array of 3 characters print all permutation combinations from the given characters
    public static void main(String[] args) {
        char[] ch1 = {'a','d','e'};
        for(String s: permutation(ch1)) {
            System.out.println(Arrays.toString( s.toCharArray( ) )  );
        }
    }

    public static Set<String> permutation(char[] ch) {

        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").
                                          replace("]", "");

        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1)
            set.add(str);
        else
            for (int i=0; i<str.length(); i++){
                String a3 = str.substring(0, i)+ str.substring(i+1);

                char[] ch2 = a3.toCharArray();
                for (String permut : permutation(ch2)) {
                    set.add(str.charAt(i) + permut);
                }
            }
        return set;
    }
}
