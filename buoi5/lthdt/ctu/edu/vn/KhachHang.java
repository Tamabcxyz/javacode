package buoi5.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class KhachHang {
	private String id,ten,dc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public KhachHang() {
		super();
		this.dc=new String();
		this.ten=new String();
		this.id=new String();
	}

	public KhachHang(String id, String ten, String dc) {
		super();
		this.id = id;
		this.ten = ten;
		this.dc = dc;
	}
	public KhachHang(KhachHang k) {
		this.id=new String(k.id);
		this.ten=new String(k.ten);
		this.dc=new String(k.dc);
	}
	public void nhap() {
		System.out.println("nhap vao id khach hang");
		this.id=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ten khach hang");
		this.ten=new Scanner(System.in).nextLine();
		System.out.println("nhap vao dia chi khach hang");
		this.dc=new Scanner(System.in).nextLine();
	}
	public void in() {
		System.out.println("id khach hang "+this.id+" ten "+this.ten+" dia chi "+this.dc);
	}
	public String toString() {
		return "id khach hang "+this.id+" ten "+this.ten+" dia chi "+this.dc;
	}
}
