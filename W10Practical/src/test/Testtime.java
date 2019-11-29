package test;

import algorithm.Mergesort;
import algorithm.Selectionsort;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Testtime {
	/**
	 * basic idea is create automation method for testing time complexity
	 * program will create asymptotic array size then get the following elapsed time
	 * elapsed use nanoseconds as it is the highest resolution time in java
	 * then it output to txt file and input into excel for plotting graph for better analyzing 
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		int[] a;
		PrintWriter writer = new PrintWriter(new File("sort.txt"));
		writer.println("Number of elements\tMerge Sort\tSelection Sort");
		for(int i =  1; i<= 100; i++) {
			// create the array size depend on the loop
			a = new int[i];
			
			// assign the random value inside the array
			for(int j = 0; j < i; j++) {
				a[j] = (int)(Math.random()*50 + 1);
			}
			
			// assign the same array into the merge sort and selection sort
			Mergesort merge = new Mergesort(a);
			Selectionsort selection = new Selectionsort(a);
			;
			
			// print amount of time of two algorithms together with size of array in standard form
			writer.println(i + "\t" + merge.getCount() + "\t" + selection.getCount());
			System.out.println();
			
		}
		writer.close();
	}

}
