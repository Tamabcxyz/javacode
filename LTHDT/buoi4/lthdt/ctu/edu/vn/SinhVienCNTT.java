package buoi4.lthdt.ctu.edu.vn;

import java.io.*;
import java.util.Scanner;

import buoi3.lthdt.ctu.edu.vn.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau,email;// SinhVienCNTT thua ke cac thuoc tinh tu SinhVien va co them taikhoan, matkhau, email
	public SinhVienCNTT() {
		super();// goi toi ham xay dung cua class cha cu the la ham xay dung ko doi so cua class SinhVien
		taikhoan=new String();
		matkhau=new String();
		email=new String();
	}
	public SinhVienCNTT(SinhVienCNTT s) {
		super(s);// goi toi ham xay dung sao chep cua class cha
		taikhoan=new String(s.taikhoan);
		matkhau=new String(s.matkhau);
		email=new String(s.email);
	}
	
	public void nhapMatKhau() {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		char f[]=new char[20];
		char c=0;
		int i=0;
		System.out.println("nhap mat khau ");
		do {
				try {
					c=(char)System.in.read();
					if(c!=13) {
						//System.out.write(42);
						
						f[i]=c;i++;
						System.out.print("*");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}while(c!=13);
		f[i]='\0';
		System.out.println("show pass ");
		for(int j=0;j<f.length;j++) {
			System.out.print(f[j]);
		}

		
		
	}
	public boolean ktrMail(String s) {
		boolean ktr=false;
		String a="@student.ctu.edu.vn";
		if(s.contains(a)==true) {
			ktr=true;
		}
		return ktr;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("nhap tai khoan");
		taikhoan=sc.nextLine();
		nhapMatKhau();
		sc.nextLine();
		do {
			System.out.println("\nnhap dia chi mail theo dung dinh dang:\t VD: tam@student.ctu.edu.vn ");
			email=sc.nextLine();
		}while(!ktrMail(email));
	}
	public void in() {
		super.in();
		System.out.println("tai khoan la: "+taikhoan+" \ndia chi mail: "+layMail());
	}
	public String toString() {
		String s=super.toString();
		return s+"\ntai khoan la: "+taikhoan+" \ndia chi mail: "+layMail();
	}
	public void doiMatKhau(String s) {
		matkhau=new String(s);
	}
	public String layMail() {
		return email;
	}
}
