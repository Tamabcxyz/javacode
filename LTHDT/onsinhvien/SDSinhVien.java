package onsinhvien;

import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien a=new SinhVien();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao so luong sinh vien ");
		int n=sc.nextInt();
		SinhVien ds[];
		ds=new SinhVien[n];
		for(int i=0;i<n;i++) {
			ds[i]=new SinhVien();
			System.out.println("nhap vao sinh vien thu "+(i+1));
			ds[i].nhap();
		}
		System.out.println("danh sach sinh vien vua nhap la \n");
		for(int i=0;i<n;i++) {
			ds[i].in();
		}
	}

}
