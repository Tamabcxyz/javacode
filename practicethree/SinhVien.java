package practicethree;

import java.util.Scanner;

import practicetwo.Date;

public class SinhVien {
	final int k=50; // dinh nghia hang so
	private String masv;
	private String hoten;
	private Date ngaysinh;
	private int soLuongHP;
	private String[]tenHP;
	private String[]diemHP;
	public SinhVien() {
		masv=new String();
		hoten=new String();
		ngaysinh=new Date();
		soLuongHP=0;
		tenHP=new String[50];
		diemHP=new String[50];
	}
	public void SinhVien(SinhVien a) {
		masv=new String(a.masv);
		hoten=new String(a.hoten);
		ngaysinh=new Date(a.ngaysinh);
		soLuongHP=0;
		for(int i=0;i<a.tenHP.length;i++) {
			tenHP[i]=new String(a.tenHP[i]);
			diemHP[i]=new String(a.diemHP[i]);
		}
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma sinh vien: ");
		masv=sc.nextLine();
		System.out.println("nhap ten sinh vien: ");
		hoten=sc.nextLine();
		System.out.println("nhap ngay thang nam sinh cua sinh vien: ");
		ngaysinh.nhap();
		System.out.println("nhap so luong mon hoc: ");
		soLuongHP=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<soLuongHP;i++) {
			System.out.println("ten hoc phan thu "+(i+1));
			tenHP[i]=new String();	//NEU TA DONG 2 DONG NAY LAI THI SE RA SAO?
			tenHP[i]=sc.nextLine();
			System.out.println("diem hoc phan thu "+(i+1));
			diemHP[i]=new String();
			diemHP[i]=sc.nextLine();
		}
	}
	public void in() {
		System.out.println("\nma sinh vien: "+masv+"\nten sinh vien: "+hoten+"\nngay sinh: "+ngaysinh+"\ndanh sach hoc phan");
		for(int i=0;i<soLuongHP;i++) {
			System.out.println(tenHP[i]+"\t"+diemHP[i]);
		}
	}
	// con ham toString ko biet viet haizz!
	
	
	
	public void themHP(String ten, String diem) {
		if(soLuongHP<tenHP.length-1) {
			tenHP[soLuongHP]=new String(ten);
			diemHP[soLuongHP]=new String(diem);
			soLuongHP++;
		}
		else System.out.println("so luong da day");
	}
	public boolean timHP(String ten) {
		boolean find=false;
		for(int i=0;i<soLuongHP;i++) {
			if(tenHP[i].equals(ten)) {
				find=true;
			} 
		}
		return find;
	}
	public void xoaHP(String ten) {
		if(timHP(ten)==true) {
			int n=0;
			for(int i=0;i<soLuongHP;i++) {
				if(tenHP[i].equals(ten))
					n=i;break;
			}
			for(int i=n;i<soLuongHP;i++) {
				tenHP[i]=tenHP[i+1];
				diemHP[i]=diemHP[i+1];
			}soLuongHP--;
		}else System.out.println("ko co hp nay");
	}
	public float diemTB() {
		float diemtb=0.0f;
		for(int i=0;i<soLuongHP;i++) {
			if(diemHP[i].equals("A")||diemHP[i].equals("a")) {
				diemtb+=4.0;
			}else if(diemHP[i].equals("B+")||diemHP[i].equals("b+")) {
				diemtb+=3.5;
			}else if(diemHP[i].equals("B")||diemHP[i].equals("b")) {
				diemtb+=3.0;
			}else if(diemHP[i].equals("C+")||diemHP[i].equals("c+")) {
				diemtb+=2.5;
			}else if(diemHP[i].equals("C")||diemHP[i].equals("c")) {
				diemtb+=2.0;
			}else if(diemHP[i].equals("D+")||diemHP[i].equals("d+")) {
				diemtb+=1.5;
			}else if(diemHP[i].equals("D")||diemHP[i].equals("d")) {
				diemtb+=1.0;
			}else if(diemHP[i].equals("F")||diemHP[i].equals("f")) {
				diemtb+=0.5;
			}
		}
		return diemtb/soLuongHP;
	}
	public String getHoTen() {
		return hoten;
	}
	public String getTen() {
		String a=new String();
		a=getHoTen();
		a=a.substring(a.lastIndexOf(" ")+1);
		return a;
	}
	
	
	
}
















