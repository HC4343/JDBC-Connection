package com.home.library.JavaIntervew;

import java.util.*;

public class MapSortByValues {
    //Write a method that can sort the Map by values

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Mcr", 55);
        map.put("Leeds", 17);
        map.put("London", 33);

        System.out.println(SorrtingByValues(map));
    }

    public static Map<String,Integer> SorrtingByValues(Map<String,Integer> map1){

        /*
        1.yol;
         List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        System.out.println(list);
         */

        //2.yol
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map1.entrySet());
        list.sort(Map.Entry.comparingByValue());

         map1 = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> each : list){
            map1.put(each.getKey(), each.getValue());

        }
        return map1;




    }


}
