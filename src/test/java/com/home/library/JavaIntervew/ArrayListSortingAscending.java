package com.home.library.JavaIntervew;

import java.util.*;

public class ArrayListSortingAscending {

    public static void main(String[] args) {
        int[] arr = {3,6,22,44,3};
        List<Integer> list1= new ArrayList<>(arr.length);
        for(Integer each : arr){
            list1.add(each);
        }
        SortingAscending(list1);
        System.out.println(list1);
    }

    public static void SortingAscending(List<Integer> list){
        //Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

//        for (int each : list){
//            System.out.println(each);
//        }
//


    }



}
