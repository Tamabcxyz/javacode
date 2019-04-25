package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Bai7 {
	public static void tachTen(String a) {
		String hoten=a.trim();// cat bo khoan trang du thua trong chuoi
		System.out.println("ten la: "+hoten);
		hoten=hoten.substring(hoten.lastIndexOf(" ")+1);// lay cac ki tu sau khoang trang cuoi cung
		System.out.println("ten la: "+hoten);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nhap vao chuoi ho ten tach lay ten
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap vao chuoi ten: ");
		s=sc.nextLine();
		tachTen(s);
		
	}

}