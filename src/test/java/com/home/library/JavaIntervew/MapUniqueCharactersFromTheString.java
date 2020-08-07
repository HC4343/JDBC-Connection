package com.home.library.JavaIntervew;

import java.util.HashMap;
import java.util.Map;

public class MapUniqueCharactersFromTheString {

    public static void main(String[] args) {

        String str1 = "WWWWrrTTTccccccchkl";
        UniqueCharaters(str1);

    }

    public static void UniqueCharaters(String str){

        Map<Character,Integer> map = new HashMap<>();
        for (int i =0; i<str.length(); i++){
            int count = 0;
            for (int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count ++;
                }
            }
            if(count==1){
                map.put(str.charAt(i), count);
            }
        }
        System.out.println(map);


    }



}
