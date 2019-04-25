package buoi4.lthdt.ctu.edu.vn;

import java.util.Scanner;

public abstract class ConVat {
	private String giong;
	private String mauLong;
	private float canNang;
	public ConVat() {
		this.giong="";
		this.mauLong="";
		this.canNang=0.0f;
	}
	public void ConVat(String giong, String mau, float nang) {
		this.giong=giong;
		this.mauLong=mau;
		this.canNang=nang;
	}
	public void nhap() {
		System.out.println("giong con vat la gi? vd:heo,bo,de");
		this.giong=new Scanner(System.in).nextLine();
		System.out.println("mau long cua no");
		this.mauLong=new Scanner(System.in).nextLine();
		System.out.println("can nang cua no");
		this.canNang=new Scanner(System.in).nextFloat();
	}
	public void in() {
		System.out.println("con "+this.giong+" mau "+this.mauLong+" nang "+this.canNang);
	}
	public String toString() {
		return "con "+this.giong+" mau "+this.mauLong+" nang "+this.canNang;
	}
	public abstract void keu();

}
