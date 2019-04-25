package buoi4.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		// class ConVat la 1 abstract class nen ta ko the new ConVat() dc
		ConVat ds[]=new ConVat[3];// tham chieu 3 con vat
		for(int i=0;i<3;i++) {
			System.out.println("nhap vao dong vat thu "+(i+1));
			System.out.println("nhap 1 la Bo\nnhap 2 la De\nnhap 3 la Heo");
			System.out.println("lua chon cua ban la gi? 1 or 2 or 3");
			int c=new Scanner(System.in).nextInt();
			switch(c) {
			case 1: ds[i]=new Bo();break;
			case 2: ds[i]=new De();break;
			case 3: ds[i]=new Heo();break;
			}
			ds[i].nhap();
			
		}
		for(int i=0;i<3;i++) {
			ds[i].in();
			ds[i].keu();
		}
		
	}

}
