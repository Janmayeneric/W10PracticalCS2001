package test;

import algorithm.Mergesort;

public class Testcode {

	public static void main(String[] args) {
		int[] test = {4,3,3,3,1};
		Mergesort sort = new Mergesort(test);
		int[] sorted = sort.getSortedArray();
		for(int element: sorted) {
			System.out.print(element + ",");
		}
	}
}
