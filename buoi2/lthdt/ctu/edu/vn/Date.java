package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Date {
	private int ngay, thang, nam;// Date bao gom cac thuoc tinh la ngay thang va nam
	// ham xay dung khong doi so
	public Date() {
		ngay=1;thang=1;nam=2011;// khoi tao gia tri ban dau
	}
	// ham xay dung co doi so
	public void Date(int day, int month, int year) {
		this.ngay=day;
		this.thang=month;
		this.nam=year;
	}
	// xay dung ham sao chep doi tuong Date, day la ham sao chep sau
	public Date(Date d) {
		ngay=d.ngay;
		thang=d.thang;
		nam=d.nam;
	}
	public boolean hopLe() {// neu ngay than nam hop le thi tra ve true nguoc lai tra ve false
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
		}while(!hopLe());// neu khong hop le thi se lap lai viec nhap
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau() {
		Date d=new Date();// khoi tao doi tuong d co kieu Date
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;// lay ngay thang nam luu vao doi tuong, neu ko co co the gay loi
		d.ngay++;// tang ngay len 1
		if(!d.hopLe()) {
			d.ngay=1;// tang ngay len neu da la ngay cuoi cung roi ta tang len la ngay 1
			d.thang++;// neu ngay =1 thi tang thanh len
			if(!d.hopLe()) {
				d.thang=1;// neu thang dang la 12 ma ngay la ngay cuoi thi thang la thang 1 
				d.nam++;// tang nam len 1 neu nhu la ngay cuoi cua thang 12
			}
		}
		return d;
	}
	public Date cong(int n) {
		Date d=new Date();
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;
		for(int i=0;i<n;i++) {
			d=d.ngayHomSau();	// cong n ngay don gian chi la goi lai n la ngay hom sau
		}
		return d;
	}
	// ham ghi de phuong thuc co the xuat thang ra doi tuong trong ham in Vd: sop(s1)<=>s1.toString() (khi ko co ham nay)
	public String toString() {
		return ngay+"/"+thang+"/"+nam; // co ham toString moi co the xuat ra duoc doi tuong
	}
}
