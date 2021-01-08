package com.home.library.JavaIntervew;

public class ArrayMoveToZeroToEnd {



        public static void main(String[] args){

            int[] arr = {1,0,2,0,3,0,4,0,8,10,5,11,0,0};
            int[] x= moveZeros(arr);

            for (int i : x) {
                System.out.println("i = " + i);
            }


        }

        public static int[] moveZeros(int[] arr){

            int[] output = new int[arr.length];
            int j=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0){
                    output[j]=arr[i];
                    j++;
                }
            }
            for(int i=j; i<arr.length; i++){
                output[i]=0;
                j++;
            }
            return output;
        }

}
