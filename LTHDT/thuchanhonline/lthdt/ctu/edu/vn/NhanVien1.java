package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class NhanVien1 {
	private String ho,ten;
	private int soSP;
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public NhanVien1(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.soSP = soSP;
		if(this.soSP<0)
			this.soSP=0;
	}
	public NhanVien1() {
		this.ho="";
		this.ten="";
		this.soSP=0;
	}
	
	public double getLuong() {
		double donGia=0;
		if(this.soSP>=1&&this.soSP<199) {
			donGia=0.5;
		}
		else if(this.soSP>=200&&this.soSP<399) {
			donGia=0.55;
		}
		else if(this.soSP>400&&this.soSP<599) {
			donGia=0.6;
		}else donGia=0.65;
		return (this.soSP*donGia);
	}
	public boolean lonHon(NhanVien1 nv2) {
		return this.soSP>nv2.soSP;
	}
	public void  nhap() {
		System.out.println("nhap vao ho: ");
		this.ho=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ten: ");
		this.ten=new Scanner(System.in).nextLine();
		System.out.println("so san pham: ");
		this.soSP=new Scanner(System.in).nextInt();
	}
	public void xuat() {
		System.out.println("ho nhan vien:"+getHo());
		System.out.println("ten nhan vien:"+getTen());
		System.out.println("so san pham cua nhan vien:"+getSoSP());
		
	}
	public String toString() {
		return "ho nhan vien: "+getHo()+" ten nhan vien: "+getTen()+" so san pham cua nhan vien: "+getSoSP();
	}
	
}
