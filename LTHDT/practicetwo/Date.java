package practicetwo;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	public Date() {
		ngay=1;thang=1;nam=2011;
	}
	public Date(Date d) {
		ngay=d.ngay;
		thang=d.thang;
		nam=d.nam;
	}
	public void Date(int ng, int th, int n) {
		ngay=n;thang=th;nam=n;
	}
	public boolean hopLe() {
		// ngay hop le la ngay ko vuot qua so ngay trong thang, ngay, thang, nam lon ho 0 thang nho hon 12
		boolean ok=false;
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(ngay>0&&thang>0&&nam>0&&thang<=12&&ngay<=max[thang]) {
			ok=true;
		}
		if(nam%4==0&&nam%100!=0||nam%400==0) {
			max[2]=29;ok=false;
		}
		return ok;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("nhap vao ngay");
			ngay=sc.nextInt();
			System.out.println("nhap vao thang");
			thang=sc.nextInt();
			System.out.println("nhap vao nam");
			nam=sc.nextInt();
		}while(!hopLe());
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau() {
		Date d=new Date();
		d.ngay=this.ngay;d.nam=this.nam;d.thang=this.thang;
		d.ngay++;
		if(!d.hopLe()) {
			d.ngay=1;
			d.thang++;
			if(!d.hopLe()) {
				d.thang=1;
				d.nam++;
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







