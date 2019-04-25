package buoi4.lthdt.ctu.edu.vn;
import java.util.Scanner;

import buoi3.lthdt.ctu.edu.vn.Diem;
public class DiemMau extends Diem {// DiemMau thua ke tu class Diem
	private String mau;// thuoc tinh mau
	public DiemMau() {
		super();// goi toi class cha cu the la ham xay dung ko doi so cua class cha
		String mau=new String();
//		Scanner sc= new Scanner(System.in);
//		System.out.println("nhap mau");
//		mau=sc.nextLine();
	}
	public DiemMau(int x, int y,String mau) {
		super(x,y);// goi ham xay dung co doi so cua class cha
	}
	public DiemMau(DiemMau dm) {
		super(dm);// goi toi ham xay dung sao chep cua class diem
		mau=new String(dm.mau);
	}
	public void ganMau(String m) {
		mau=new String(m);
	}
	// day dc goi la nap de
	public void nhap() {
		super.nhap();// goi toi ham nhap cua class diem
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao mau");
		mau=sc.nextLine();// nhap vao them thuoc tinh mau
	}
	public void in() {
		super.in();// goi ham in cua class diem
		System.out.println("mau "+mau);
	}
	public DiemMau doiXung() {
		DiemMau kq=new DiemMau(-layX(),-layY(),mau);
		return kq;
	}
}
