package practicethree;

import java.util.Scanner;

import buoi3.lthdt.ctu.edu.vn.SinhVien;

public class SDSinhVien {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		SinhVien s=new SinhVien();
		s.nhap();
		s.in();
		String ten, diem;
		System.out.println("nhap vao ten va diem hoc phan can them ");
		Scanner sc=new Scanner(System.in);
		ten=sc.nextLine();
		diem=sc.nextLine();
		s.themHP(ten,diem);
		s.in();
		String tenxoa;
		System.out.println("nhap vao ten hoc phan can xoa ");
		tenxoa=sc.nextLine();
		s.xoaHP(tenxoa);
		s.in();
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao so luong sinh vien trong danh sach");
		int n=0;
		n=sc.nextInt();
		SinhVien ds[]=new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.println("sinh vien thu "+(i+1));
			ds[i]=new SinhVien();
			ds[i].nhap();
		}
		for(int i=0;i<n;i++) {
			System.out.println("danh sach sinh vien vua nhap la:");
			ds[i].in();
		}
		System.out.println("danh sach sinh vien bi canh bao hoc vu la\n");
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()<0.8) {
				System.out.println(ds[i].getHoTen());
			}
		}
		
		System.out.println("sinh vien co diem trung binh cao nhat\n ");
		float max;
		max=ds[0].diemTB();
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()>max) {
				max=ds[i].diemTB();
			}
		}
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()==max) {
				//ds[i].in();
				System.out.println(ds[i].getHoTen());
			}
		}
		
		System.out.println("Ten sinh vien theo ki tu alphabet la: ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds[i].getTen().compareTo(ds[j].getTen())>0) {
					SinhVien s=new SinhVien();
					s=ds[i];
					ds[i]=ds[j];
					ds[j]=s;
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ds[i].getHoTen());
		}
	}

}
