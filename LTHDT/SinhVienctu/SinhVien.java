package SinhVienctu;

import java.util.Scanner;

public class SinhVien {
	// class sinh vien bao gom: id ,ten, tuoi, dia chi, so luong hoc phan, ten hoc phan, diem trung binh
	private String id,ten,diaChi;
	private int tuoi,soHP;
	private String HP[],diemTB[];
	Scanner sc=new Scanner(System.in);
	public SinhVien() {
		this.id="";
		this.ten="";
		this.diaChi="";
		this.tuoi=0;
		this.soHP=0;
		this.HP=new String[50];
		this.diemTB=new String[50];
	}
	public SinhVien(SinhVien sv) {
		this.id=new String(sv.id);
		this.ten=new String(sv.ten);
		this.diaChi=new String(sv.diaChi);
		this.tuoi=sv.tuoi;
		this.soHP=sv.soHP;
		this.HP=new String[50];
		this.diemTB=new String[50];
		for(int i=0;i<sv.HP.length;i++) {
			HP[i]=new String(sv.HP[i]);
			diemTB[i]=new String(sv.diemTB[i]);
		}
	}
	public void nhap() {
		System.out.println("nhap id sinh vien: ");
		this.id=sc.nextLine();
		System.out.println("nhap ten sinh vien: ");
		this.ten=sc.nextLine();
		System.out.println("nhap dia chi sinh vien: ");
		this.diaChi=sc.nextLine();
		System.out.println("nhap tuoi sinh vien: ");
		this.tuoi=sc.nextInt();
		System.out.println("nhap so luong hoc phan: ");
		this.soHP=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<this.soHP;i++) {
			System.out.println("ten hoc phan thu "+(i+1));
			HP[i]=new String();
			HP[i]=sc.nextLine();
			System.out.println("diem trung binh hoc phan thu "+(i+1));
			diemTB[i]=new String();
			diemTB[i]=sc.nextLine();
		}
		
	}
	public void in() {
		System.out.println("\nINFORMATION OF SINH VIEN");
		System.out.println("ID: "+this.id+"\tten: "+this.ten+"\ndia chi: "+this.diaChi+"\ttuoi: "+this.tuoi+"\nso luong hoc phan dk: "+this.soHP);
		for(int i=0;i<this.soHP;i++) {
			System.out.println("ten HP: "+this.HP[i]+"\tdiem trung binh: "+this.diemTB[i]);
		}
	}
	public String toString() {
		String s1="";
		String s="\nINFORMATION OF SINH VIEN\n"+"ID: "+this.id+"\tten: "+this.ten+"\ndia chi: "+this.diaChi+"\ttuoi: "+this.tuoi+"\nso luong hoc phan dk: "+soHP;
		for(int i=0;i<this.soHP;i++) {
			s1+="\nten HP: "+this.HP[i]+"\tdiem trung binh: "+this.diemTB[i];
		}
		return s+s1;
	}
	public SinhVien(String id, String ten, String diaChi, int tuoi, int soHP, String[] hP, String[] diemTB) {
		super();
		this.id = id;
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
		this.soHP = soHP;
		HP = hP;
		this.diemTB = diemTB;
	}
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getSoHP() {
		return soHP;
	}
	public void setSoHP(int soHP) {
		this.soHP = soHP;
	}
	public String[] getHP() {
		return HP;
	}
	public void setHP(String[] hP) {
		HP = hP;
	}
	public String[] getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(String[] diemTB) {
		this.diemTB = diemTB;
	}
	
	

}
