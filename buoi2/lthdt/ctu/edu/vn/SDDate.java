package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class SDDate {
	public static void main(String args[]) {
//		Date a=new Date();
//		a.nhap();
//		a.in();
//		a=a.ngayHomSau();
//		a.in();
		Date c=new Date();
		c.Date(26, 02, 2019);
		c.in();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao so ngay can tang ");
		int n=sc.nextInt();
		System.out.println("sau khi tang n ngay so ngay va thang nam tang se la: ");
		c=c.cong(n);// ta phai co bien c de luu lai kq moi dc. tuyet doi ko "c.cong(n)"nhu vay kq ko dc luu lai
		c.in();
	}
}
