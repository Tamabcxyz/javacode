package buoi3.lthdt.ctu.edu.vn;

import java.util.Scanner;
class SDGach {
	public static void main(String[] args) {
		// Nhap danh sach n loai gach
		Gach ds[];// mot mang danh sach cac loai gach
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap so loai gach n = ");
		int n = kb.nextInt();
		ds = new Gach[n];
		for(int i=0; i<n; i++) {
			ds[i] = new Gach();
			System.out.println("Nhap thong tin cho loai gach thu " + (i+1));
			ds[i].nhap();
		}
		// Hien thi danh sach
		System.out.println("\nDanh sach gach vua nhap");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + ". ");
			ds[i].hienThi();
		}
		// Tim loai gach co chi phi lot thap nhat
		int vitri = 0;
		for(int i=1; i<n; i++)
			if(  ((float)ds[vitri].layGiaBan() / ds[vitri].dienTich()) 
			   > ((float)ds[i].layGiaBan() / ds[i].dienTich()) )// de co lua chon loai gach co chi phi ok nhat ta lay gia ban chi cho dien tich
				vitri = i;
		System.out.println("\nLoai gach cho chi phi lot thap nhat");
		for(int i=0; i<n; i++)
			if(  ((float)ds[i].layGiaBan() / ds[i].dienTich()) 
			  == ((float)ds[vitri].layGiaBan() / ds[vitri].dienTich()) )
				ds[i].hienThi();// hien thi ten gach co chi phi thap nhat
		// Chi phi mua gach khi lot nen 5m x 20m (D=2000 x N=500)
		System.out.println("\nChi phi lot nen 5m x 20m");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + ". ");
			ds[i].hienThi();
			System.out.println(" co chi phi lot: " +
				ds[i].soluongHop(2000, 500) * ds[i].layGiaBan());// chi phi bang so luong hop nhan gia ban
		}
		
	}
}