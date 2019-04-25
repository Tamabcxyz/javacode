package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class ThapHaNoi {

	public static void main(String[] args) {
		// giai bai toan chuyen dia hay con goi la thap ha noi
		char a='A',b='B',c='C';
		System.out.println("nhap vao so luong dia can chuyen");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HaNoiTown(n,a,b,c);

	}

	public static void HaNoiTown(int n, char a, char b, char c) {
		if(n==1) {
			chuyen(n,a,c);
		}else {
			HaNoiTown(n-1,a,c,b);
			chuyen(n,a,c);
			HaNoiTown(n-1,b,a,c);
		}
		
	}
	public static void chuyen(int n,char a, char b) {
		System.out.println("chuyen tu cot "+a+" sang cot "+b);
	}

}
