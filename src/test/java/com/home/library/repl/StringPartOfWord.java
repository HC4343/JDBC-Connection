package com.home.library.repl;

public class StringPartOfWord {
    /*
    Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
    otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
     */
    public static void main(String[] args) {
        String word = "xgoksalX";

        if (word.startsWith("X") || word.startsWith("x")){
            word = word.substring(1);
        }

        if (word.endsWith("X") || word.endsWith("x")){
            word = word.substring(0, word.length()-1);
        }
        System.out.println(word);

    }



}
