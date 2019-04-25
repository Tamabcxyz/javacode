package giaithuat.edu;

public class MergeSort extends Sort {
	private int data[];
	private int temp[];
	public MergeSort(int data[]) {
		this.data=data;
		this.temp=new int[data.length];
	}
	@Override
	public void Sort(int left, int right) {
		if(left>right) {
			return;
		}
		int mid=(left+right)/2;
		Sort(left,mid);
		Sort(mid+1,right);
		int i=left;
		int j=mid+1;
		int k=left;
		boolean overLeft=false;
		boolean overRight=false;
		while(k<=right) {
			if(overLeft==false&&(data[i]<=data[j])) {
				temp[k]=data[i];
				k++;
				i++;
				if(i==mid+1) {
					overLeft=true;
					break;
				}
				continue;
			}
			if(overRight==false&&(data[j]<=data[i])) {
				temp[k]=data[j];
				k++;
				j++;
				if(j==right+1) {
					overRight=true;
					break;
				}
				continue;
			}
			if(overLeft) {
				for(;j<=right;j++,k++) {
					temp[k]=data[j];
				}
			}
			if(overRight) {
				for(;i<=mid;i++,k++) {
					temp[k]=data[i];
				}
			}
			for(int index=left;index<=right;index++) {
				data[index]=temp[index];
			}
		}
	}
	
}
