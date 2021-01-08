package com.home.library.repl;

public class ArrayConsecutiveHas5 {
    /*
    Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
    If no consecutive 5s or no 5s are detected in your code then print false.

    nums → [1, 5, 5, 1, 1] → true
    nums → [1, 8, 5, 5, 0] → true
    nums → [1, 5, 4, 1, 5] → false
    nums → [1, 4, 4, 1, 99] → false
     */
    public static void main(String[] args) {

        int[] arr = {1, 4, 9, 5, 5, 11};

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 5 && arr[i + 1] == 5) {
                count++;
            }

        }
        if (count>0){
            System.out.println("true");
        }else {
            System.out.println("false");

    }
}









}
