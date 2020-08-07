package com.home.library.JavaIntervew;

public class StringFrequencyOfcharacter {
    public static void main(String[] args) {
       String st = "rrrTTGGvvvv";
        System.out.println(FrequencyOfcharacter(st));
    }

    public static String FrequencyOfcharacter(String str){
        String nunDup ="";
        for (int i=0; i<str.length(); i++){
            if (!nunDup.contains(str.charAt(i)+"")){
                nunDup +=str.charAt(i);
            }
        }
        String result = "";

        for (int i =0; i<nunDup.length(); i++){
            int count = 0;
            for (int j= 0; j<str.length(); j++){
                if (str.charAt(j)==nunDup.charAt(i)){
                    count ++;
                }
            }
            result +=nunDup.charAt(i)+" "+count+"\n";
        }
        return result;



    }
}
