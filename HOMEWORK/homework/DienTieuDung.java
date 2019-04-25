package homework;

import java.util.Scanner;
public class DienTieuDung {
	private  int ThanhTien;
	private int soluong, dongia;
	private float dinhmuc;
	public DienTieuDung() {
		soluong=0;
		dongia=0;
		dinhmuc=0.0f;
	}
	public DienTieuDung(int n, int gia, float Dm) {
		this.soluong=n;
		this.dinhmuc=Dm;
		this.dongia=gia;
	}
	public int ThanhTien() {
		if (soluong<=dinhmuc)
			return soluong*dongia;
		else 
			return (int) (soluong* dongia*dinhmuc+soluong*dongia*2.5);
	}
	public void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap so kw tieu thu:");
		soluong=sc.nextInt();
		System.out.println("Nhap kw dinh muc:");
		dinhmuc=sc.nextFloat();
		System.out.println("gia 1 kw/h tieu thu:");
		dongia=sc.nextInt();
	}
	public void in() {
		System.out.println("\nSo Kw tieu thu dien: "+soluong+"\ndien ap dinh muc "+dinhmuc+"\ndon gia 1 kw dien: "+dongia);
	}
	@Override
	public String toString() {
		return "So Kw tieu thu dien: "+soluong+"\n dien ap dinh muc "+dinhmuc+"\n don gia 1 kw dien: "+dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public float getDinhmuc() {
		return dinhmuc;
	}
	public void setDinhmuc(float dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	public  int getThanhtien() {
		return ThanhTien;
	}
	public void setThanhTien(int total) {
		this.ThanhTien=total;
	}
	
}
