package com.home.library.JavaIntervew;

import java.util.Arrays;

public class StringSameLetter {

    public static void main(String[] args) {
        String str1 = "AAAAgggTT";
        String str2 = "Ag";
        SameLetter(str1,str2);
    }

    public static void SameLetter(String aa1, String aa2){

        String nunDup = "";
        for (int i =0; i<aa1.length(); i++){
            if (!nunDup.contains(aa1.charAt(i)+"")){
                nunDup +=aa1.charAt(i);
            }
        }
        char[] ch1 = nunDup.toLowerCase().toCharArray();
        char[] ch2 = aa2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String bb = Arrays.toString(ch1);
        String cc = Arrays.toString(ch2);
        if (bb.equals(cc)){
            System.out.println("Equals");
        }else {
            System.out.println("not equals");
        }


    }
}
