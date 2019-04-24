package buoi3.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class SDSinhVien {

	public static void main(String[] args) {// phan nam sinh cua sinh vien in bi loi
		// TODO Auto-generated method stub
//		SinhVien a=new SinhVien();
//		a.nhap();
//		String ten=new String(); // hoac co the nhu nay: String ten=" ";
	Scanner sc=new Scanner(System.in);
//		System.out.println("ten HP can them ");
//		ten=sc.nextLine();//sc.nextLine();
//		System.out.println("diem cua HP ");
//		String diem;
//		diem=sc.nextLine();
//		a.ThemHP(ten, diem);
//		a.in();
		System.out.println("nhap vao so luong sinh vien\n");// nhap vao so luong sinh vien trong ds
		int n=sc.nextInt();
		SinhVien ds[];
		ds=new SinhVien[n];
		for(int i=0;i<n;i++) {
			ds[i]=new SinhVien();
			System.out.println("nhap sinh vien thu "+(i+1));
			ds[i].nhap();
		}
		System.out.println("danh sach sinh vien vua nhap la \n");
		for(int i=0;i<n;i++) {
			ds[i].in();
		}
		System.out.println("\n\n");
		System.out.println("danh sach sinh vien bi canh bao hoc vu la\n");
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()<0.8) {
//				ds[i].in();
				System.out.println(ds[i].getHoTen());
			}
		}
		System.out.println("\n\n");
		System.out.println("sinh vien co diem trung binh cao nhat\n ");
		float max;
		max=ds[0].diemTB();
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()>max) {
				max=ds[i].diemTB();
			}
		}
		for(int i=0;i<n;i++) {
			if(ds[i].diemTB()==max) {
				//ds[i].in();
				System.out.println(ds[i].getHoTen());// neu diem tb=max thi ta
			}
		}
		System.out.println("\n\n");
		System.out.println("Ten sinh vien theo ki tu alphabet la: ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds[i].getTen().compareTo(ds[j].getTen())>0) {
					SinhVien s=new SinhVien();
					s=ds[i];
					ds[i]=ds[j];
					ds[j]=s;
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ds[i].getHoTen());
		}
		
	}

}
