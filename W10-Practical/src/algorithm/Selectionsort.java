package algorithm;

public class Selectionsort {

	private int[] a;
	private long st;
	private long et;
	private long dur;
	private int count;
	
	public Selectionsort(int[] in_a){
		this.count = 0;
		this.a = in_a;
		this.st = System.nanoTime();
		this.sort();
		this.et = System.nanoTime();
		this.dur = this.et - this.st;
	}
	
	public int[] getArray() {
		return this.a;
	}
	
	public long getDuration() {
		return this.dur;
	}
	
	public int getCount() {
		return this.count;
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
					this.count += 2;
				}
				this.count += 2;
			}
			int temp = this.a[i];
			this.a[i] = this.a[min_l];
			this.a[min_l] = temp;
			this.count += 6;
		}
	}
}
