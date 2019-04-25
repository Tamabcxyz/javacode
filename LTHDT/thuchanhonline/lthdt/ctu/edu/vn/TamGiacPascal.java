package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

	public class TamGiacPascal {
	public static int pasCal(int k, int n) {
		if(k==0||k==n)return 1;
		else return pasCal(k,n-1)+pasCal(k-1,n-1);
	}
	public static void hienThi1() {
		System.out.println("nhap vao so dong can in ra");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(pasCal(k,i)+" ");
			}
			System.out.println();
		}
	}
	public static int giaiThua(int n) {
		int gt=1;
		if(n==0||n==1)return 1;
		else {
			for(int i=2;i<=n;i++) {
				gt*=i;
			}
		}return gt;
	}
	public static void hienThi2() {
		System.out.println("nhap vao so dong can in ra");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(giaiThua(i)/(giaiThua(k)*giaiThua(i-k))+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// in tam giac pascal
		hienThi1();
		//hienThi2();
	}

}



// code tam giac pascal, chen mang vao mang, duong di day nhat, java huong doi tuong