package buoi5mohinhhoabaitoan;


import java.util.Scanner;

import buoi2.lthdt.ctu.edu.vn.Date;

public class HoaDon {
	private String maHoaDon;
	private String tenHoaDon;
	private Date ngayXuatHoaDon;
	public HoaDon() {
		maHoaDon="";
		tenHoaDon="";
		ngayXuatHoaDon=new Date();
	}
	public void HoaDon(String ma, String ten, Date ngay) {
		this.maHoaDon=ma;
		this.tenHoaDon=ten;
		this.ngayXuatHoaDon=ngay;
	}
	public HoaDon(HoaDon h) {
		this.maHoaDon=new String(h.maHoaDon);
		this.tenHoaDon=new String(h.tenHoaDon);
		this.ngayXuatHoaDon=new Date(h.ngayXuatHoaDon);
	}
	public void nhap() {
		System.out.println("nhap ma cua hoa don");
		maHoaDon=new Scanner(System.in).nextLine();
		System.out.println("nhap ten hoa don");
		tenHoaDon=new Scanner(System.in).nextLine();
		System.out.println("nhap ngay xuat cua hoa don");
		ngayXuatHoaDon.nhap();
	}
	public void in() {
		System.out.println("ma hoa don "+this.maHoaDon+" ten "+this.tenHoaDon+" ngay xuat "+this.ngayXuatHoaDon.toString());
	}
	public String toString() {
		return "ma hoa don "+this.maHoaDon+" ten "+this.tenHoaDon+" ngay xuat "+this.ngayXuatHoaDon.toString();
	}
}
