package test;

import algorithm.Mergesort;
import algorithm.Selectionsort;

public class Testcode {

	public static void main(String[] args) {
		int[] test = {3,4,5,4,3,2,21,3,3,3,54,4,54,4,65,46,768,54,89,47,6,676,567,67};
		Mergesort sort = new Mergesort(test);
		int[] sorted = sort.getSortedArray();
		for(int element: sorted) {
			System.out.print(element + ",");
		}
		System.out.println();
		Selectionsort sort1 = new Selectionsort(test);
		int[] sorted1 = sort1.getArray();
		for(int element: sorted1) {
			System.out.print(element + ",");
		}
	}
}
