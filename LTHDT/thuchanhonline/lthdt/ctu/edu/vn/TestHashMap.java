package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
	public static HashMap<Integer,String>map=new HashMap<Integer,String>();
	public static void menu() {
		System.out.println("\nnhap 1 de them");
		System.out.println("nhap 2 de xuat");
		System.out.println("nhap 3 de sua");
		System.out.println("nhap 4 de xoa");
		System.out.println("nhap 5 de tim kiem");
		System.out.println("nhap 6 de thoat");
		System.out.println("BAN MUON CHON CAI NAO??");
		int chon=new Scanner(System.in).nextInt();
		switch(chon) {
		case 1: them();break;
		case 2: xuat();break;
		case 3: sua();break;
		case 4: xoa();break;
		case 5: timKiem();break;
		case 6: System.err.print("cam on ban da dung thu phan mem\n");System.exit(0);
		}
	}

private static void timKiem() {
		System.out.println("nhap vao ten sach can tim");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String>element:map.entrySet()) {
			if(element.getValue().contains(ten)) {
				System.out.println("ten sach ban tim co ma la: "+element.getKey());
			}
		}
		
	}

private static void xoa() {
		System.out.println("nhap vao ma muon xoa");
		int ma=new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("ma khong ton tai");
		}else {
			map.remove(ma);
		}
		
	}

private static void sua() {
		System.out.println("nhap vao ma sach can sua");
		int ma=new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false) {
			System.out.println("ma ban nhap khong ton tai");
		}else {
			System.out.println("nhap vao ten sach");
			String ten=new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
		
	}

private static void xuat() {
		System.out.println("Ma\tTen sach");
		for(Map.Entry<Integer,String>element:map.entrySet()) {
			System.out.println(element.getKey()+"\t"+element.getValue());
		}
		
	}

private static void them() {
		System.out.println("nhap vao ma sach");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("nhap vao ten sach can them");
		String ten=new Scanner(System.in).nextLine();
		if(map.containsKey(ma)==false) {
			map.put(ma, ten);
		}
	}

//	public static void xuat() {
//		for(Map.Entry<Integer,String>item:map.entrySet()) {
//			
//		}
//	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
		
	}

}
