package com.home.library.JavaIntervew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSortingDescendingOrder {

	public static void main(String[] args) {


		// 1 st decleration;
		int[] arr = {10,89,20,300,10,900, 0, 1};
		List<Integer> list2= new ArrayList<>(arr.length);
		for(int each: arr) {
			list2.add(each);
		}
		SortingArrayListAsc(list2);

		// 2 nd decleration;
		List<Integer> list3= new ArrayList<>(Arrays.asList(2,5,6,7,888,99,0));

	}

	public static void SortingArrayListAsc(List<Integer> list) {

		for ( int i=0; i<list.size(); i++) {

			for(int j=list.size()-1; j>i; j--) {
				if(list.get(i) < list.get(j)) {
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
