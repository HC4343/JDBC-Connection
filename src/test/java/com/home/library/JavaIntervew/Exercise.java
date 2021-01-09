package com.home.library.JavaIntervew;

import io.cucumber.java.sl.In;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("HI", 15);
        map.put("John", 9);
        map.put("Alia", 11);

        TreeSet<Integer> set = new TreeSet<>(map.values());
        System.out.println(set.first());
    }

}

