package com.home.library.JavaIntervew;

public class StringReverse {

    public static void main(String[] args) {

        String str = "EoEEEEbbF";
        System.out.println(Reverse(str));
    }

    public static String Reverse(String str1){

        //solution 1;
//        StringBuilder str5 = new StringBuilder(str1);
//        str5.reverse();
//        return str5.toString();

        //solution2;
        String result ="";
        for (int i=str1.length()-1; i>=0; i--){
            result +=str1.charAt(i);
        }
        return  result;

    }
//public static void main(String[] args) {
//    String str = "abcd";
//    String reverse= "";
//    for (int i= str.length()-1; i>=0; i--) {
//        reverse +=str.toCharArray()[i];
//    }
//    System.out.println(reverse);
//

}

