package com.home.library.JavaIntervew;


import java.util.LinkedHashSet;

public class StringRemoveDublicate {
    public static void main(String[] args) {
        String str = "EEEEEEbbF";
        System.out.println(Removedup(str));
    }

    public static String Removedup(String str1) {
        //solution 1;
//        String result = "";
//        for (int i =0; i<str1.length(); i++){
//            if (!result.contains(str1.charAt(i)+"")){
//                result +=str1.charAt(i);
//            }
//        }
//
//       return result;
//    }

        //solution 2;

        String[] arr = str1.split("");

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String each : arr) {
            set.add(each);
        }

        return set.toString().replace("[","").replace("]","").replace(", ","");

    }

}
