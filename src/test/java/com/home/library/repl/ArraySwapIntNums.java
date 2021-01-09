package com.home.library.repl;

import java.util.Arrays;

public class ArraySwapIntNums {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 44, 1, 100, 55};

        //anlamadm..???????????????
        int middle=nums.length/2;
        for (int i = 0 , j=nums.length-1; i <middle ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //asagidaki calismadi???
//        for (int i=0; i<nums.length/2; i++){
//            for (int j=nums.length; j>0; j--){
//                int temp =nums[i];
//                nums[i]=nums[j];
//                nums[j]=temp;
//            }
//        }
        System.out.println(Arrays.toString(nums));

    }


}
