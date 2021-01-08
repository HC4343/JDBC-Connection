package com.home.library.repl;

public class ArrayStringFirstLastElement {

    public static void main(String[] args) {

        String[] words = {"Goksal", "Belma", "Feyza", "Furkan"};

        //solution 1;
//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),
//                input.nextLine()};

//        for (int i=0; i<words.length; i++){
//            for (int j=0; j<words[i].length(); j++){
//            }
//            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
//        }

        //solution 2;
        for (int i=0; i< words.length; i++){
            System.out.println(""+words[i].charAt(0) + words[i].charAt(words[i].length()-1));
//           words[i] = " "+words[i].charAt(0) + words[i].charAt(words[i].length()-1);
//           words[i]= words[i].trim();
//            System.out.println(words[i]);
        }



    }


}
