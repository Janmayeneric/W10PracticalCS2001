package algorithm;

public class Selectionsort {

	private int[] a;
	
	public Selectionsort(int[] in_a){
		this.a = in_a;
		this.sort();
	}
	
	public int[] getArray() {
		return this.a;
	}
	
	/**
	 * selection sorting using the nested loop and temporary variable to compare the value
	 */
	private void sort() {
		
		// the temporary value of minimum number and its location index
		int min;
		int min_l;
		for(int i = 0; i < this.a.length; i++) {
			min = this.a[i];
			min_l = i;
			for(int j = i; j< this.a.length;j++) {
				if(min > this.a[j]) {
					min = this.a[j];
					min_l = j;
				}
			}
			int temp = this.a[i];
			this.a[i] = this.a[min_l];
			this.a[min_l] = temp;
		}
	}
}
