package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestKhachHang {
	static ArrayList <KhachHang>dskh=new ArrayList<KhachHang>();
	public static void menu() {
		System.out.println("nhap 1 de nhap");
		System.out.println("nhap 2 de xuat");
		System.out.println("nhap 3 de luu");
		System.out.println("nhap 4 de mo");
		System.out.println("nhap 5 de thoat");
		System.out.println("thim muon la gi??");
		int a=new Scanner(System.in).nextInt();
		switch(a) {
		case 1:	nhap();break;
		case 2: xuat();break;
		case 3: luu();break;
		case 4: mo();break;
		case 5: {
			System.err.println("thanks you used my app");
			System.exit(0);break;
			}
		}
	}
	private static void luu() {
		if(docfile.saveFile(dskh,"D:/filekhachhang.txt")==true) {
			System.out.println("luu file thanh cong");
		}
		
	}
	private static void xuat() {
		for(KhachHang d:dskh) {
			System.out.println(d);
		}
		
	}
	private static void nhap() {

		System.out.println("nhap vao ma khach hang");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("nhap vao ten khach hang");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("nhap an sinh the dang dd/MM/yyyy");
		Date d= conventstringtodate.formString(new Scanner(System.in).nextLine()); 
		KhachHang kh=new KhachHang(ma,ten,d);
		dskh.add(kh);
		
	}
	private static void mo() {
		dskh=docfile.docFile1("D:/filekhachhang.txt");
		
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
