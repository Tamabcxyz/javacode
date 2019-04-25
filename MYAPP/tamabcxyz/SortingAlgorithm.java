package tamabcxyz.code;

import java.io.Serializable;

import giaithuat.edu.InsertionSort;
import giaithuat.edu.MergeSort;
import giaithuat.edu.QuickInsertionSort;
import giaithuat.edu.QuickSort;

public class SortingAlgorithm implements Serializable{
	private int array[];
	private int threshold;
	public SortingAlgorithm(int array[]) {
		this.array=array;
	}
	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}
	private int[] copyData() {
		int temp[]=new int[array.length];
		System.arraycopy(array, 0, temp, 0, array.length);
		return temp;
	}
	public long getTime() {
		return System.nanoTime();
	}
	public String insertionSort() {
		int temp[]=copyData();
		long start=getTime();
		InsertionSort algorithm=new InsertionSort(temp);
		algorithm.Sort();
		long end=getTime();
		long duration=end-start;
		if(duration<5000000) {
			return duration+"ns";
		}else {
			return (long)(duration/1000000)+"ms";
		}
		
	}
	public String mergeSort() {
		int temp[]=copyData();
		long start=getTime();
		MergeSort algorithm=new MergeSort(temp);
		algorithm.Sort();
		long end=getTime();
		long duration=end-start;
		if(duration<5000000) {
			return duration+"ns";
		}else {
			return (long)(duration/1000000)+"ms";
		}
	}
	public String quickSort() {
		int temp[]=copyData();
		long start=getTime();
		QuickSort algorithm=new QuickSort(temp);
		algorithm.Sort();
		long end=getTime();
		long duration=end-start;
		if(duration<5000000) {
			return duration+"ns";
		}else {
			return (long)(duration/1000000)+"ms";
		}
	}
	
	public String quickInsertionSort() {
		int temp[]=copyData();
		long start=getTime();
		QuickInsertionSort algorithm=new QuickInsertionSort(temp,getThreshold());
		algorithm.Sort();
		long end=getTime();
		long duration=end-start;
		if(duration<5000000) {
			return duration+"ns";
		}else {
			return (long)(duration/1000000)+"ms";
		}
	}
}
