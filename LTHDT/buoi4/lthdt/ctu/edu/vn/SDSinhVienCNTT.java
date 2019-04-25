package buoi4.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		SinhVienCNTT ds[];
		System.out.println("nhap so luong sinh vien");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ds=new SinhVienCNTT[n];
		for(int i=0;i<n;i++) {
			ds[i]=new SinhVienCNTT();
			System.out.println("nhap thong tin sinh vien thu "+(i+1));
			ds[i].nhap();
		}
		String email=new String();
		email=sc.nextLine();
		for(SinhVienCNTT s:ds) {
			System.out.println(s); // do ham toString chua viet dung chua hien ds hoc phan la phai roi!
		}
		

	}

}
