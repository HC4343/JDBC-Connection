package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortAscending {
	//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

	public static void main(String[] args) {

		int[] arr = {5,7,11,1,44,5,22};
		//		ArrayList<Integer> list = new ArrayList();
		//		for(int each: arr) {
		//			list.add(each);
		//		}

		SortingArrayAsc(arr);


	}

	public static void SortingArrayAsc(int[] arr) {
		ArrayList<Integer> list = new ArrayList();
		for(int each: arr) {
			list.add(each);
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j =list.size()-1; j > i; j--) {
				if (list.get(i) > list.get(j)) {
					
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		for (int i: list) {
			System.out.print(i+" ");

		}
	}
}

/*
 *Write a return method that can sort an int array 
 *in Ascending order without using the sort method of 
 *the Arrays class 
 */

//	int[] arr = {10,6,4,3,7,2};
//
//	System.out.println(Arrays.toString(sortArrayAlgorithm(arr)));
//	
//}
//public static int[] sortArrayAlgorithm(int[] array) { //sort in descending order
//    
//	for (int i = 0; i < array.length; i++) {
//        for (int j = 0; j < array.length; j++) {
//            if (array[i] <= array[j]) {
//                int x = array[i];
//                array[i] = array[j];
//                array[j] = x;
//            }
//        }
//    }
//    return array;
//}
//
//




//	public static void SortingArrayAsc(int[] arr) {
//
//		ArrayList<Integer> list = new ArrayList();
//
//		for(int each: arr) {
//
//		list.add(each);
//
//		}
//
//		for (int i = 0; i < list.size(); i++) {
//
//		            for (int j = 0; j < list.size(); j++) {
//
//		            if (list.get(i) < list.get(j)) {
//
//		                    Integer temp = list.get(i);
//
//		                    list.set(i, list.get(j));
//
//		                    list.set(j, temp);
//
//		            }
//
//		              }
//
//		}
//
//		for(int i=0; i < list.size(); i++) {
//
//		arr[i] = list.get(i);
//
//		}
//



