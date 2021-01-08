package com.home.library.repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPrintShortestWords {

    public static void main(String[] args) {

        String str ="olive fish pursuit old warning python java coffee cat ray";
        //String str = "olive,fish,pursuit,old,warning,python,java,coffee,cat,ray,omer";

        List<String> newStr = new ArrayList<>(Arrays.asList(str.split(" ")));

        String smallestStr = newStr.get(0);

        for (String s : newStr) {
            if (s.length() <= smallestStr.length()) {
                smallestStr = s;
            }

        }

        System.out.println("smallestStr = " + smallestStr);

        List<String> smallestStrList = new ArrayList<>();

        for (String s : newStr) {

            if (s.length() == smallestStr.length()) {
                smallestStrList.add(s);
            }
        }
        System.out.println(smallestStrList);

//        String[] arr = str.split(", ");
//        String small =arr[0];
//        String empty ="";
//
//        for (int i=0; i<arr.length; i++){
//            //arr[i]= arr[i].trim();
//            if (small.length()>arr[i].length()){
//                small=arr[i];
//            }
//        }
//
//        for (int j=0; j<arr.length; j++){
//            if (small.length()==arr[j].length()){
//                empty +=arr[j]+",";
//            }
//        }
//
//        empty = empty.substring(0, empty.length()-1);
//        String [] latest= empty.split(",");
//        Arrays.sort(latest);
//        System.out.println(Arrays.toString(latest));

//        String[] array = str.split(", ");
//
//
//        int minValue = 100;
//        for (int i = 0; i < array.length; i++){
//            if (array[i].length() < minValue)
//                minValue = array[i].length();
//        }
//
//        int count = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i].length() == minValue)
//                count++;
//        }
//
//        String[] result = new String[count];
//        int j = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i].length() == minValue){
//                result[j] = array[i];
//                j++;
//            }
//        }
//        Arrays.sort(result);
//        System.out.println(Arrays.toString(result));
//
//





        }

    }