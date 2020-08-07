package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveSomeValue {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 8, 4, 0, 2, 11));
        List<Integer> list2 = new ArrayList<>();

        for (Integer each : list1){
            if(each<7){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
