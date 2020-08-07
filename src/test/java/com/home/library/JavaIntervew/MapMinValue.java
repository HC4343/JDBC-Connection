package com.home.library.JavaIntervew;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapMinValue {
    //Write a method that can return the minimum value from ta map (DO NOT use sort method)
    public static void main(String[] args) {
        Map<String, Integer>  map = new LinkedHashMap<>();
        map.put("Mcr",12);
        map.put("leeds", 23);
        map.put("Hull", 10);
        System.out.println(map);

    }

    public static int MinValue(Map<String,Integer> map1){
        TreeSet<Integer> set = new TreeSet<>(map1.values());
        return set.first();
    }

}
