package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
import java.util.Arrays;
public class Bai6 {
	public static int ktrNguyenTo(int a) {
		int dem=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				dem++;
			}
		}
		if(dem==2)return 1;
		else return 0;
	}
	public static void toBinary(int n) {// chuyen so thao phan ve he nhi phan
		int i=0,b=0;
		int a[];
		a=new int[50];
		while(n>0) {
			a[i]=n%2;
			n=n/2;
			i++;// luu so du vua tim vao mang a[]
		}
		for(int j=i-1;j>=0;j--) {// duyet nguoc de xuat ra phan tu cua mang a[]
			System.out.print(a[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nhap vao so nguyen kiem tra xem co phai so nguyen to hay ko in ra duoi dang nhi phan
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao so nguyen a: ");
		a=sc.nextInt();
		if(ktrNguyenTo(a)==1)System.out.println("la so nguyen to ");
		else System.out.println("ko phai so nguyen to ");
		toBinary(a);
	}

}
