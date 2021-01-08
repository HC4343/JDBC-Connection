package com.home.library.repl;

public class ArrayPrintOnceElement {

    //soru; array'de sadece tek bulunanlari konsola al.
    public static void main(String[] args) {

        int[] arr ={1, 1, 2, 3, 4, 3, 4};

        for (int i =0; i<arr.length; i++){
            int count=0;
            for (int j=0; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count ++;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }

    }

    //2 nd solution (scanner class ve for each loop ile cozum;
    /*
    Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count =0;

        for(int each1: nums) {
            count = 0;
            for(int each2: nums) {

                if(each1  == each2) {
                    count++;
                }

            }
            if(count ==1) {
                System.out.println(each1);
            }
        }


     */


}
