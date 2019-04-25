package buoi5.lthdt.ctu.edu.vn;

import java.util.Scanner;

import buoi2.lthdt.ctu.edu.vn.Date;

public class KhachHangVip extends KhachHang{
	private float giam;
	private Date ngaysinh;
	public KhachHangVip() {
		super();
		this.giam=0.0f;
		this.ngaysinh=new Date();
	}
	public KhachHangVip(KhachHangVip kv) {
		super(kv);// neu o day la first statem... ta phai sua benh khach hang "public KhachHang(KhachHang k)"
		this.giam=kv.giam;
		this.ngaysinh=new Date(kv.ngaysinh);
	}
	public void setGiam(float giamgia) {
		this.giam=giamgia;
	}
	public float getGiam() {
		return this.giam;
	}
	public void setNgaySinh(Date ng) {
		this.ngaysinh=ng;
	}
	public Date getNgaySinh() {
		return this.ngaysinh;
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("nhap vao ngay sinh");
		this.ngaysinh.nhap();
		System.out.println("nhap vao giam gia");
		this.giam=new Scanner(System.in).nextFloat();
	}
	public void in() {
		super.in();
		System.out.println(" ngay sinh "+this.ngaysinh+" giam gia "+this.giam);
	}
	public String toString() {
		return super.toString()+" ngay sinh "+this.ngaysinh+" giam gia "+this.giam;
	}
	

}
