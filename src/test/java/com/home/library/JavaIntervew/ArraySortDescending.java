package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortDescending {
	//	//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
	//
	//			Ex:  int[] arr = {10,20,7, 8, 90};
	//
	//			                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
	//
	//			 
	//
	//			Solution 1:
	//	public static void main(String[] args) {
	//		
	//		int[] arr = {5,7,11,1,44,5,22};
	//		
	//		System.out.println(Sort(arr));
	//	}
	//	public static int[] Sort(int[] a) {
	//
	//		ArrayList<Integer> list=new ArrayList<Integer>();
	//		for(int each: a)
	//			list.add(each);
	//
	//		for(int i=0; i < a.length; i++) {
	//			a[i] = findMax(list);
	//			list.remove(Integer.valueOf(a[i]));
	//		}
	//		return a;
	//	}
	//
	//	public static int findMax(ArrayList<Integer> a) {
	//		int max=Integer.MIN_VALUE;
	//		for(int each: a)
	//			max = Math.max(max, each);
	//
	//		return max;
	//
	//	}

	//			 
	//
	//			Solution 2:
	//
	public static void main(String[] args) {

		int[] arr = {5,7,11,1,44,5,22};
//		ArrayList<Integer> list = new ArrayList();
//		for(int each: arr) {
//			list.add(each);
//		}
		
		SortingArrayDesc(arr);


	}

	public static void SortingArrayDesc(int[] arr) {
		ArrayList<Integer> list = new ArrayList();
		for(int each: arr) {
			list.add(each);
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j =list.size()-1; j > i; j--) {
				if (list.get(i) < list.get(j)) {
					
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
