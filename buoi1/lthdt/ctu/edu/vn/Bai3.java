package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Bai3 {
	public static Float ktrNhap() {
		String s; Float n=0.0f; Boolean t=true;
		Scanner sc=new Scanner(System.in);
		do {
			s=sc.nextLine();// nhap vao chuoi
			try {
				n=Float.parseFloat(s);// ep ve so thuc
				t=true;
			}catch(Exception e) {
				t=false;
				System.out.println("nhap lai");// su ly loi
			}
		}while(t==false);
		return n;
	}

	public static void nhap(float a[]) {// nhap vao 1 mang cac so thuc
		for(int i=0;i<a.length;i++) {
			System.out.println("nhap ptu thu "+(i+1));
			a[i]=ktrNhap();// kiem tra nhap xem co dung hay sai
		}
	}
	public static void display(float a[]) {
		for(float e:a) {
			System.out.println(e);// hien thi ra ds cac phan tu co trong mang a[]
		}
	}
	public static float tinhTong(float a[]) {
		float tong=0.0f;
		for(int i=0;i<a.length;i++) {
			tong=tong+a[i];// tinh tong mang
		}
		return tong;
	}
	public static float maxMang(float a[]) {
		float max=0.0f;max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];// tim phan tu co gia tri lon nhat trong mang
			}
		}
		return max;
	}
	public static void sapXep(float a[]) {
		for(int i=0;i<a.length-1;i++) {// chay tu dau den cuoi mang
			for(int j=i+1;j<a.length;j++) {// chay truoc i 1 cot vd: dong =0 thi cot =1
				if(a[i]>a[j]) {
					float temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		// nhap vao ds so thuc hien thi so lon nhat va tong cac so co tron ds loai tru cac so khong hop le
		float a[];
		int n;
		System.out.println("nhap vao so ptu");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new float[n];
		nhap(a);
		display(a);
		System.out.println("tong cua ds la "+tinhTong(a));
		System.out.println("max cua mang la "+maxMang(a));
		sapXep(a);
		System.out.println("sau khi sap xep ta dc day so sau: ");
		display(a);
	}
}