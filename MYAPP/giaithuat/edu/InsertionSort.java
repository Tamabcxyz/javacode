package giaithuat.edu;

public class InsertionSort extends Sort {

	public InsertionSort() {
		super();
	}
	public InsertionSort(int data[]) {
		this.data=data;
	}
	@Override
	public void Sort() {
		int i,key,j;
		for(i=1;i<data.length;i++) {
			key=data[i];
			j=i;
			while((j>0)&&(data[j-1]>key)) {
				data[j]=data[j-1];
				j--;
			}
			data[j]=key;	
		}
	}
	
}
