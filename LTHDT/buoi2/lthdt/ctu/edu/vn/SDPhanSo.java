package buoi2.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String args[]) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.print("a = ");
		a.hienThi(); System.out.println();
		System.out.print("b = ");
		b.hienThi(); System.out.println();
		// Tao ra 2 phan so x va y
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap gia tri phan so x");
		x.nhap();
		System.out.println("Nhap gia tri phan so y");
		y.nhap();
		// Hien thi gia tri nghich dao
		PhanSo z = new PhanSo(x);
		z.nghichDao();
		System.out.print("Gia tri nghich dao cua x = ");
		z.hienThi(); System.out.println();
		// Tinh tong x+y
		PhanSo kq = new PhanSo();
		kq = x.cong(y);
		System.out.print("x + y = ");
		kq.hienThi(); System.out.println();
		// Nhap danh sach phan so
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap so luong n = ");
		int n = kb.nextInt();
		PhanSo ds[];
		ds = new PhanSo[n];// danh sach la mang n phan so
		for(int i=0; i<n; i++) {
			ds[i] = new PhanSo();
			System.out.println("Nhap phan so thu " + (i+1));
			ds[i].nhap();
		}
		// Tinh tong n phan so
		PhanSo tong = new PhanSo();
		for(int i=0; i<n; i++)
			tong = tong.cong(ds[i]);
		System.out.print("Tong danh sach: ");
		tong.hienThi(); System.out.println();
		// Tim phan so lon nhat
		int vitri = 0;
		for(int i=1; i<n; i++)
			if( ds[i].lonHon(ds[vitri]) )
				vitri = i;
		System.out.print("Phan so lon nhat trong ds: ");
		ds[vitri].hienThi(); System.out.println();
		// Sap xep danh sach tang dan
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++)
				if( ds[i].lonHon(ds[j]) ) {
					PhanSo temp = new PhanSo();
					temp.makeCopy(ds[i]);
					ds[i].makeCopy(ds[j]);
					ds[j].makeCopy(temp);
				}
		System.out.println("Danh sach phan so sau khi sap xep");
		for(int i=0; i<n; i++) {
			ds[i].hienThi();
			System.out.print("\t");
		}
	}
}
