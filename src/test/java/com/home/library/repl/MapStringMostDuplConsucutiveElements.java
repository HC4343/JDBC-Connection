package com.home.library.repl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStringMostDuplConsucutiveElements {

    public static void main(String[] args) {
        find_consec_max_occur("bbaaaabbbbaaaaaaacd");
    }
    /**
     * Find the maximum consecutive occurrences of a character in a string supplied.
     * For e.g. "bbaaaabbbbaaaaaaacd", should result in a: 7, b: 4, c: 1, d: 1 NOTE: "a" occurs twice consecutively,
     * but the second instance has the maximum occurrence.
     * @param word
     */
    private static void find_consec_max_occur(String word) {

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = word.toCharArray();
        char target = arr[0];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]) {
                count++;
            }
            else{
                count=1;
                target = arr[i];
            }
            if(map.getOrDefault(target,0)<count){
                map.put(target, count);
            }
            System.out.println(map);
        }
    }
}
