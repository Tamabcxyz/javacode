package giaithuat.edu;

public class QuickSort extends Sort {
	
	public QuickSort(int a[]) {
		this.data=a;
	}
	private void exchange(int i,int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
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
				Sort(low,j);
			}
			if(i<hight) {
				Sort(i,hight);
			}
		}
	}
}
