package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;

public class Bai8 {
	public static int ktrNhap() {
		Scanner sc=new Scanner(System.in);
		String s; boolean t=true; int n=0;
		do {
			System.out.println("nhap vao so nguyen: ");
			s=sc.nextLine();
			try {
				n=Integer.parseInt(s);
				t=true;
			}catch(Exception e) {
				t=false;
				System.out.println("nhap lai");
			}
		}while(t==false);
		
		return n;
	}
	public static void nhap(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println("phan tu thu "+(i+1));
			a[i]=ktrNhap();
		}
	}
	public static void display(int a[]) {
		for(int e:a) {
			System.out.println(e);
		}
	}
	public static int timKiem(int a[],int x) {
		int dem=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x)dem++;
		}
		return dem;
	}
	public static void timViTri(int a[], int x) {
		int i=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==x)System.out.print(i+" ");
		}
	}
	public static void sapXep(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nhap vao danh sach so nguyen. tim 1 so nguyen trong ds. Sap xep ds tang. Hien thi ds ra mang hinh
		Scanner sc=new Scanner(System.in);
		int a[];int n;
		System.out.println("nhap vao so ptu cua mang: ");
		n=sc.nextInt();
		a=new int[n];
		nhap(a);
		System.out.println("ds vua nhap la: ");
		display(a);
		System.out.println("so phan tu x co trong mang la: "+timKiem(a,3));
		System.out.println("vi tri phan tu trung la: ");timViTri(a,3);
		sapXep(a);
		System.out.println("sau khi sap xep ds la: ");
		display(a);
	}

}
