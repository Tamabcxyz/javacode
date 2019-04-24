package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Bai5 {
	public static float ktrNhap() {
		Scanner sc=new Scanner(System.in);
		String s; boolean t=true;float n=0.0f;
		do {
			s=sc.nextLine();
			try {
				n=Float.parseFloat(s);// ep ve so thuc
				t=true;
			}catch(Exception e) {
				t=false;
				System.out.println("nhap lai: ");
			}
		}while(t==false);
		return n;
	}
	public static void giaiPTBac1(float a, float b) {
		// ax+b=0
		if(a==0&&b!=0) {
			System.out.println("phuong trinh vo nghiem! ");
		}else if(a!=0&&b!=0) {
			System.out.println("phuong trinh co nghiem la: "+(-b/a));
		}else {
			System.out.println("phuong trinh vo nghiem! ");
		}
		
	}
	public static void giaiPTBac2(float a,float b,float c) {
		// ax^2+bx+c=0
		float x1=0.0f;float x2=0.0f;
		float denta=(float)Math.pow(b, 2)-4*a*c;
		if(denta<0) {
			System.out.println("phuong trinh vo nghiem! ");
		}else if(denta==0) {
			System.out.println("phuong trinh co nghiem kep: "+(-b/(2*a)));
		}else {
			System.out.println("phuong trinh co 2 nghiem phan biet:");
			x1=(float)(-b+Math.sqrt(denta))/(2*a);
			x2=(float)(-b-Math.sqrt(denta))/(2*a);
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// giai phuong trinh bac 1 va bac 2
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao a: ");
		a=ktrNhap();
		System.out.println("nhap vao b: ");
		b=ktrNhap();
		System.out.println("nhap vao c: ");
		c=ktrNhap();
		System.out.println("KET QUA GIAI PT BAC 1 LA: ");
		giaiPTBac1(a,b);
		System.out.println("KET QUA GIAI PT BAC 2 LA: ");
		giaiPTBac2(a,b,c);
	}

}