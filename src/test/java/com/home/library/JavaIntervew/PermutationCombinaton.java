package com.home.library.JavaIntervew;

import java.util.*;

public class PermutationCombinaton {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text :");
        String str1 = sc.nextLine();

        char[] charArr = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            charArr[i] = str1.charAt(i);
        }
        printPermutation(charArr);
    }

    public static void printPermutation(char[] ch) {

        for (String s : permutation(ch)) {
            String str = s.replace(", ", "").replace("[", "").replace("]", "");
            System.out.print(str + " ,");
        }
    }

    public static ArrayList<String> permutation(char[] cha) {

        String str = Arrays.toString(cha).replace(", ", "").replace("[", "").replace("]", "");
        System.out.println("str = " + str);
        //  Set<String> set = new LinkedHashSet<>();

        ArrayList<String> list = new ArrayList<>();

        if (str.length() == 1) {
            list.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {

                String a3 = str.substring(0, i) + str.substring(i + 1);//0+1
                System.out.println("str.substring(0, i) = " + str.substring(0, i));
                System.out.println("str.substring(i+1) = " + str.substring(i + 1));
                System.out.println("a3 = " + a3);
                char[] ch2 = a3.toCharArray();
                for (String per : permutation(ch2)) {
                    list.add(str.charAt(i) + per);
                    System.out.println("per = " + per);
                }
            }
        }
        return list;

    }
    //        System.out.println(Arrays.toString(s.toCharArray()));
//            ArrayList<String> strList = permutation(ch);
//            for(int i=0; i<strList.size();i++) {
//                if(i<=strList.size()-2) {
//                    String str = strList.get(i).replace(", ", "").replace("[", "").replace("]", "");
//                    System.out.print(str + " ,");
//                }else if(i==strList.size()-1){
//                    String str = strList.get(i).replace(", ", "").replace("[", "").replace("]", "");
//                    System.out.print(str);
//                }
}
