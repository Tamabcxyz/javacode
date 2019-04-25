package onsinhvien;

public class SDDate {
	public static void main(String args[]) {
		Date d=new Date();
		d.nhap();
		d.in();
		d=d.ngayHomSau();d.in();
		d=d.congNNgay(20);d.in();
	}
}
