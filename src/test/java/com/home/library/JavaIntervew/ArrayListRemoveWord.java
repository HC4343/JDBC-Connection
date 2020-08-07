package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveWord {
    public static void main(String[] args) {

        List<String> names =new ArrayList<>(Arrays.asList("Ali", "Hasan", "John","Ali"));
      //  List<String> newList = new ArrayList<>();

        names.removeAll(Arrays.asList("Ali"));
        System.out.println(names);

    }





}
