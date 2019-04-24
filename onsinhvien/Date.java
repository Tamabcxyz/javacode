package onsinhvien;

import java.util.Scanner;

public class Date {
	private int ngay,thang,nam;
	public Date() {
		ngay=1;thang=1;nam=2011;
	}
	public void Date(int ng, int th, int na) {
		ngay=ng;thang=th;nam=na;
	}
	// sao chep doi tuong
	public Date(Date d) {
		ngay=d.ngay;
		thang=d.thang;
		nam=d.nam;
	}
	public boolean hopLe() {
		boolean ok=false;
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};// gan so ngay cua cac thang vao mang tuong ung
		if(nam%4==0&&nam%100!=0||nam%400==0) {// kiem tra nam nhuan neu la nam nhuan thi thang 2 co 29 ngay
			max[2]=29;ok=false;
		}
		if(thang>0&&nam>0&&ngay>0&&thang<13&&ngay<=max[thang]) {// cai mang ten la max chua so ngay tu thang 0->thang 12
			ok=true;
		}
		return ok;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("nhap vao ngay:");
			ngay=sc.nextInt();
			System.out.println("nhap vao thang:");
			thang=sc.nextInt();
			System.out.println("nhap vao nam:");
			nam=sc.nextInt();
		}while(!hopLe());
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau() {
		Date d=new Date();
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;
		d.ngay++;
		if(!hopLe()) {
			d.ngay=1;d.thang++;
			if(!hopLe()) {
				d.thang=1;d.nam++;
			}
		}
		return d;
		
	}
	public Date congNNgay(int n) {
		Date d=new Date();
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;
		for(int i=0;i<n;i++) {
			d=d.ngayHomSau();
		}
		return d;
	}
	
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
	
}






