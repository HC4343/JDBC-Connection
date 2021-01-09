package com.home.library.JavaIntervew;

public class StringPolindorme {
    public static void main(String[] args) {
        String A = "abcdcba";

        String rev2 = new StringBuilder(A).reverse().toString();
        //sb.reverse();

       // String rev2 = sb.toString();

        if(A.equals(rev2)){
            System.out.println("Yes");;
        }else{
            System.out.println("No");;
        }

//        boolean check = true;
//
//        for (int i = 0; i<str.length()/2; i++){
//            if (str.charAt(i) != str.charAt(str.length()-1-i)){
//                check =false;
//                break;
//            }
//        }
//
//        if (check){
//            System.out.println("Polindorme");
//        }else {
//            System.out.println("not polindorme");
//        }

    }


}
