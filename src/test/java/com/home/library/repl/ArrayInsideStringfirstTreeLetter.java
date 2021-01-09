package com.home.library.repl;

public class ArrayInsideStringfirstTreeLetter {

    public static void main(String[] args) {


        String[] arr = {"Goksal", "Belma", "Feyza", "Furkan"};

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length(); i++){
                System.out.println(arr[i].substring(j,j+3));
            }
        }
        /*
        //Scanner class ile cozum:

        Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i].substring(0, 3));
		}
         */





    }




}
