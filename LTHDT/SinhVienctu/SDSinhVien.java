package SinhVienctu;

import java.util.ArrayList;
import java.util.Scanner;

public class SDSinhVien {
	public static SinhVien sv=new SinhVien();
	public static ArrayList<SinhVien>ds=new ArrayList<SinhVien>();
	public static Scanner sc=new Scanner(System.in);
	
	public static void menu() {
		// them, sua, xoa, sap xep theo ten va diem tb, thoat
		System.out.println("1. them sinh vien");
		System.out.println("2. xuat sinh vien");
		System.out.println("3. sua sinh vien");
		System.out.println("4. xoa sinh vien");
		System.out.println("5. sap xep sinh vien theo ten");
		System.out.println("6. sap xep sinh vien theo diem trung binh");
		System.out.println("7. thoat");
		System.out.println("m muon  chon cai nao??");
		int chon=new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			them();break;
		case 2:
			xuat();break;
		case 3: 
			sua();break;
		case 4: 
			xoa();break;
		case 5:
			sapXepTen();break;
		case 6:
			sapXepDiem();break;
		case 7:System.exit(0);
			
		}
				
	}

	private static void sapXepDiem() {
		// TODO Auto-generated method stub
		
	}

	private static void sapXepTen() {
		// TODO Auto-generated method stub
		
	}

	private static void xoa() {
		System.out.println("nhap vao ID sinh vien ");
		String IDDelete=sc.nextLine();
		for(SinhVien d:ds) {
			if(IDDelete.equals(d.getId())) {
				ds.remove(d);
			}
		}
		
	}

	private static void sua() {
		xoa();
		SinhVien s=new SinhVien();
		s.nhap();
		ds.add(s);
		
		
	}
	private static void xuat() {
		for(int i=0;i<ds.size();i++) {
			System.out.print(ds.get(i)+"\t");
		}
		System.out.println();
		
	}
	private static void them() {
		SinhVien s=new SinhVien();
			s.nhap();
			ds.add(s);
		
	}

	public static void main(String[] args) {
		
		while(true) {
			menu();
		}
	}

}
