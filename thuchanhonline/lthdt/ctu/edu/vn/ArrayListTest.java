package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListTest {
	public static ArrayList <Integer>ds=new ArrayList <Integer>();
	
	public static void menu() {
		System.out.println("\nnhap 1 de them");
		System.out.println("nhap 2 de xuat");
		System.out.println("nhap 3 de sua");
		System.out.println("nhap 4 de xoa");
		System.out.println("nhap 5 de tim kiem");
		System.out.println("nhap 6 de sap xep");
		System.out.println("nhap 7 de thoat");
		System.out.println("BAN MUON CHON CAI NAO??");
		int chon=0;
		chon=new Scanner(System.in).nextInt();
		switch(chon) {
		case 1: them();break;
		case 2: xuat();break;
		case 3: sua();break;
		case 4: xoa();break;
		case 5: {
			if(timKiem()==-1) {
				System.out.println("khong co trong danh sach");break;
			}else System.out.print("so ban tim co trong danh sach o vi tri "+timKiem());	break;
		}
		case 6: sapXep();break;
		case 7:{
			System.err.print("cam on ban da su dung phan mem");System.exit(0);
		}
		}
	}
	private static void sapXep() {
		Collections.sort(ds);
		
	}
	private static int timKiem() {
		System.out.println("nhap vao so muon tim");
		new Scanner(System.in).nextLine();
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i)==n) {
				return i;
			}
		}return -1;
		
	}
	private static void xoa() {
		System.out.println("nhap vao vi tri can xoa");
		int n=new Scanner(System.in).nextInt();
		ds.remove(n);
		System.out.println("xoa thanh cong");
	}
	private static void sua() {
		System.out.println("nhap vao vi tri muon sua");
		int n=new Scanner(System.in).nextInt();
		System.out.println("nhap vao so moi");
		int value =new Scanner(System.in).nextInt();
		ds.set(n, value);
		System.out.println("sua thanh cong!");
		
	}
	private static void xuat() {
		System.out.println("danh sach la:");
//		for(int e:ds) {
//			System.out.print(e+"\t");
//		}
		for(int i=0;i<ds.size();i++) {
			System.out.print(ds.get(i)+"\t");
		}
		System.out.println();
	}
	private static void them() {
		System.out.println("nhap vao phan tu muon them");
		int value=new Scanner(System.in).nextInt();
		ds.add(value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ban hay them, xuat, sua, xoa, tim kiem, sap xep, thoat.
		while(true) {
			menu();
		}
	}

}
