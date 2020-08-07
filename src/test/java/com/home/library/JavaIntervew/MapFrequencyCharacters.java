package com.home.library.JavaIntervew;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyCharacters {
    //Write a method that prints the frequency of each character from a String
    public static void main(String[] args) {

        String str = "aaaRRTTTTTTTTTTbbbb";
         Frequency(str);
    }

    public static void Frequency(String str1){

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] ch = str1.toCharArray();

        for(Character each : ch){
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1);
                //............tam ustteki deger 1 oluyor, uzerine bir bir ilave ediliyor.
            }else {
                map.put(each,1);
            }
        }
        System.out.println(map);
    }

}
