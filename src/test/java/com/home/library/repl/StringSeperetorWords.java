package com.home.library.repl;

public class StringSeperetorWords {
    /*
    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: Thi
     */

    public static void main(String[] args) {

        String word = "Goksal";
        String seperator = "---";
        int times = 4;

        System.out.println(Seperator(word,seperator,times));
    }
    public static String Seperator(String word, String seperator, int times){

        String str = word;//ilkinde str , word olarak yaziliyor. Sonra loop'ta 3 kere de diger geri kalanlari uzerine ekleniyor.

        for (int i=0; i<times-1; i++ ){
            str += seperator + word;

        }
        return str;

    }


}
