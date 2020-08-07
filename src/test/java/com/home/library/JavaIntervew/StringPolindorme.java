package com.home.library.JavaIntervew;

public class StringPolindorme {
    public static void main(String[] args) {
        String str = "abcdcba";

        boolean check = true;

        for (int i = 0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                check =false;
                break;
            }
        }

        if (check){
            System.out.println("Polindorme");
        }else {
            System.out.println("not polindorme");
        }

    }


}
