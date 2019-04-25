package danhba.dt;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFDanhBa {
	static ArrayList <DanhBa>dsDb=new ArrayList<DanhBa>();
	public static void menu() {
		System.out.println("1.nhap");
		System.out.println("2.xuat");
		System.out.println("3.luu");
		System.out.println("4.doc");
		System.out.println("5.thoat");
		System.out.println("ban chon cai nao??");
		int chon=new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:{
				nhap();
				break;
			}
		case 2:{
				xuat();
				break;
			}
		case 3:{
				luu();
				break;
			}
		case 4:{
				doc();
				break;
			}
		case 5:{
				System.err.println("cam on ban dung thu phan mem!!");
				System.exit(0);break;
			}
		}
	}
	private static void doc() {
		dsDb=ReadFileSerializable.readFile("D:/danhba.txt");
		xuat();
	}
	private static void luu() {
		if(ReadFileSerializable.saveFile(dsDb, "D:/danhba.txt")==true) {
			System.out.println("luu thanh cong");
		}
	}
	private static void xuat() {
		for(DanhBa db:dsDb) {
			System.out.println(db);
		}
	}
	private static void nhap() {
		System.out.println("nhap ten");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("nhap so dien thoai");
		String phone= new Scanner(System.in).nextLine();
		DanhBa db=new DanhBa(ten,phone);
		dsDb.add(db);
	}	
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
