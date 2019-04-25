package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Bai4 {
	public static int ktrNhap() {
		String s;boolean t=true;// tao boolean de kiem tra nhap hop le hay ko
		int a=0;
		Scanner sc=new Scanner(System.in);
		do {
			s=sc.nextLine();// nhap vao a la 1 chuoi
			try {
				// try la phan thuc thi lenh
				a=Integer.parseInt(s);// chuyen chuoi ve so nguyen
				t=true;// chuyen thanh cong
			}catch(Exception e) {
				// catch la phan su ly ngoai le khi co loi xay ra
				t=false;// chuyen that bai
				System.out.println("nhap lai: ");
			}
			
		}while(t==false);// khi nhap vao sai thi nhap lai
		return a;
	}
	public static void main(String[] args) {
		// tinh tong 2 so, voi dieu kien nhap vao chuoi va sau do chuyen chuoi thanh so roi cong, neu chuoi nhap 
		// vao ko phai so thi keu nhap lai
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap a: ");
		a=ktrNhap();
		System.out.println("nhap b: ");
		b=ktrNhap();
		System.out.println("tong 2 so a b la: "+(a+b));
	}

}