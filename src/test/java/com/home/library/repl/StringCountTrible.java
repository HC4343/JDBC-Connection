package com.home.library.repl;

public class StringCountTrible {

    public static void main(String[] args) {
        // kac adet 3 lu vardir.
        String str = "xxxabyyyycd"; // burada 4 adet y var--> yani 2 degil , 3 tane 3 lu olmus oluyor.

        int count =0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                if(str.charAt(i) == str.charAt(i + 2))
                    count++;
        }

        System.out.println(count);


    }



}
