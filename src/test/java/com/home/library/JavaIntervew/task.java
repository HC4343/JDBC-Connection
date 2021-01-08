package com.home.library.JavaIntervew;

public class task {

    public static void main(String[] args) {

        String str ="aadr34_8_ij";
        boolean length = str.length() >= 4;
        boolean lowerCase = str.matches(".*[a-z].*");
        boolean upperCase = str.matches(".*[A-Z].*");
        boolean digits = str.matches(".*[0-9].*");
        boolean start = Character.isAlphabetic(str.charAt(0));
        boolean end = !str.endsWith("_");
        boolean contain;
        int count=0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==Character.valueOf('_')) {
                count ++;
            }
        }
        System.out.println(count);


    }
}
