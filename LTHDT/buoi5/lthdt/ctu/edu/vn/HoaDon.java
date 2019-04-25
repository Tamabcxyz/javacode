package buoi5.lthdt.ctu.edu.vn;

import java.util.Scanner;

import buoi2.lthdt.ctu.edu.vn.Date;

public class HoaDon {
	private String id,ten;
	private KhachHang k;
	private HangHoa hh[];
	private int soluong;
	private Date ngayviet;
	public HoaDon() {
		this.id=new String();
		this.ten=new String();
		this.k=new KhachHang();
		this.hh=new HangHoa[50];
		this.ngayviet=new Date();
		this.soluong=0;
	}
	public HoaDon(HoaDon h) {
		this.id=new String(h.id);
		this.ten=new String(h.ten);
		this.k=new KhachHang(h.k);
		this.soluong=0;
		this.ngayviet=new Date(h.ngayviet);
		this.hh=new HangHoa[50];
		for(int i=0;i<h.hh.length;i++) {
			this.hh[i]=new HangHoa(h.hh[i]);
		}
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap id hoa don");
		this.id=new Scanner(System.in).nextLine();
		System.out.println("nhap ten hoa don");
		this.ten=new Scanner(System.in).nextLine();
		System.out.println("nhap khach hang");
		k.nhap();
		System.out.println("nhap ngay viet hoa don");
		ngayviet.nhap();
		System.out.println("nhap so luong hang hoa");
		this.soluong=new Scanner(System.in).nextInt(); 
		for(int i=0;i<this.soluong;i++) {
			System.out.println("hang hoa thu "+(i+1));
			hh[i]=new HangHoa();
			hh[i].nhap();
		}
	}
	public void in() {
		System.out.println("id hoa don "+this.id+"\n ten hoa don "+this.ten+"\n"+this.k+"\n "+"\n ngay viet hoa don "+this.ngayviet);
		for(int i=0;i<this.soluong;i++) {
			System.out.println(hh[i]);
		}
	}
	
	public String toString() {
		String s,s1=null;
		s="id hoa don "+this.id+"\n ten hoa don "+this.ten+"\n"+this.k+"\n "+"ngay viet hoa don "+this.ngayviet+"\n";
		for(int i=0;i<this.soluong;i++) {
			s1=""+hh[i]+"\n";
		}
		return s+s1;
	}
}
