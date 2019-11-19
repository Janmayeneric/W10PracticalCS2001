package algorithm;

public class Mergesort {

	int[] a;
	public Mergesort(int[] in_a) {
		this.a = in_a;
		this.mergeSort(0, this.a.length - 1);
	}
	
	public int[] getSortedArray() {
		return this.a;
	}
	private void mergeSort(int s,int e) {
		if(s < e) {
			int h = (s + e) / 2;
			this.mergeSort(s,h);
			this.mergeSort(h+1,e);
			this.merge(s,h,e);
		}
	}
	
	/**
	 * merge two sub array into one sorted array
	 * @param s1 start index of first sub array
	 * @param e1 end index of first sub array
	 * @param e2 end index of second sub array
	 */
	private void merge(int s1, int e1, int e2) {
		System.out.println(s1 + " " + e1 +" " + e2);
		int a1_len = s1 - e1 + 1, a2_len = e2 - e1;
		
		// declare sentinel value for possible problems due to different size of array
		int sen = 1;
		if(this.a[e1] > this.a[e2]) {
			sen += this.a[e1];
		}else {
			sen += this.a[e2];
		}
		int[] a1 = new int[a1_len + 1];
		int[] a2 = new int[a2_len + 1];
		// create temporary array for sorting and then merge them together
		for(int i = 0; i < a1.length; i ++) {
			a1[i] = a[s1 + i];
		}
		for(int i = 0; i < a2.length; i ++) {
			a2[i] = a[e1 + 1 + i];
		}
		// last element of array is sentinel value which is larger than any other values in array
		a1[a1.length - 1] = sen;
		a2[a2.length - 1] = sen;
		int t1 = 0, t2 = 0;
		for(int i = s1; i <= e1 ; i++) {
			if(a1[t1] < this.a[t2]) {
				this.a[i] = a1[t1];
				t1++;
			}else {
				this.a[i] = a2[t2];
				t2++;
			}
		}
	}
}
