package giaithuat.edu;

public class QuickInsertionSort extends Sort {
	private int data[];
	private int threshold;
	public QuickInsertionSort(int data[], int threshold) {
		this.data=data;
		this.threshold=threshold;
		System.out.println("Threshold"+this.threshold);
	}
	private void exchange(int i,int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
	public void InsertionSort(int start, int end) {
		int i,j,key;
		for(i=start;i<=end;i++) {
			key=data[i];
			j=i;
			while(j>0&&data[j-1]>key) {
				data[j]=data[j-1];
				j--;
			}
			data[j]=key;
		}
	}
	public void Sort(int low, int hight) {
		int i=low, j=hight;
		int pivot=data[low+(hight-low)/2];
		while(i<j) {
			while(data[i]<pivot) {
				i++;
			}
			while(data[j]>pivot) {
				j--;
			}
			if(i<j) {
				exchange(i,j);
				i++;
				j--;
			}
			if(low<j) {
				if(j-low<=threshold) {
					InsertionSort(low,j);
				}
				else Sort(low,j);
			}
			if(i<hight) {
				if(hight-i<=threshold) {
					InsertionSort(i,hight);
				}else Sort(i,hight);
			}
		}
	}
	
	
}
