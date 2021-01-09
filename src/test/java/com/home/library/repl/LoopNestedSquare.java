package com.home.library.repl;

public class LoopNestedSquare {
    public static void main(String[] args) {

        int number = 5;
        for (int i = 0; i < number; i++){
            if (i == 0 || i == 4){
                for (int j = 0; j < number; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            if (i >= 1 && i <= 3){
                for (int j = 0; j < number; j++){
                    if (j == 0 || j == 4){
                        System.out.print("*");
                    }
                    else if (j >= 1 && j <= 4){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }
}
