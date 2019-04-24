package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class Array000 {
	private static int a[];
	
	public static void meNu() {
		System.out.println("\nnhap 1 de nhap vao mang");
		System.out.println("nhap 2 de xuat mang");
		System.out.println("nhap 3 de tinh tong mang");
		System.out.println("nhap 4 de tim kiem phan tu trong mang");
		System.out.println("nhap 5 de tim so lon nhat trong mang");
		System.out.println("nhap 6 de tim so nho nhat trong mang");
		System.out.println("nhap 7 de xuat so nguyen to trong mang");
		System.out.println("nhap 8 de sap xep mang tang dan");
		System.out.println("nhap 9 de sap xep mang giam dan");
		System.out.println("nhap -1 de thoat khoi truong trinh");
		System.out.println("su lua chon cua ban la: ");
		int chon=new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:{
			nhapMang();break;
		}
		case 2:{
			xuatMang();break;
		}
		case 3:{
			tongMang();break;
		}
		case 4:{
			timKiem();break;
		}
		case 5:{
			maxMang();break;
		}
		case 6:{
			minMang();break;
		}
		case 7:{
			soNguyenTo();break;
		}
		case 8:{
			sapXepTang();break;
		}
		case 9:{
			sapXepGiam();break;
		}
		case -1:{
			System.err.println("cam on ban da dung phan mem");
			System.exit(0);
		}
		default:{
			System.out.println("lua chon khong hop le vui long nhap lai");
			break;
		}
		
			
		}
		
	}
	
	private static void minMang() {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
		
	}

	private static void maxMang() {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

	public static void sapXepGiam() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void sapXepTang() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void soNguyenTo() {
		
		for(int i=0;i<a.length;i++) {
			int dem=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					dem++;
				}
			}
			if(dem==2) {
				System.out.print(a[i]+"\t");
			}
		}
		
	}

	public static void timKiem() {
		System.out.println("nhap vao so can tim");
		int solan=0;
		String s="";
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				solan++;
				s=s+i+",";
			}
		}
		if(solan==0) {
			System.out.println(k+" khong co trong mang");
		}else System.out.println(k+" co trong mang "+k+" xuat hien "+solan+"lan\nvi tri xuat hien cua "+k+" la: "+s);
		
	}

	public static void tongMang() {
		int tong=0;
		for(int i=0;i<a.length;i++) {
			tong+=a[i];
		}
		System.out.println("tong cua cac phan tu mang la: "+tong);
	}

	private static void xuatMang() {
		System.out.println("mang vua nhap la");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}

	public static void nhapMang() {
		System.out.println("nhap vao so luong cua mang");
		int n=new Scanner(System.in).nextInt();
		a=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			a[i]=rd.nextInt(10);
		}
		
	}

	public static void main(String args[]) {
		while(true) {
			meNu();
		}
	}

}
