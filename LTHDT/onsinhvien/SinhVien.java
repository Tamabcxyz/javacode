package onsinhvien;

import java.util.Scanner;

public class SinhVien {
	private String masv;
	private String hten;
	private Date ngaysinh;
	int soHP;
	String tenHP[];
	String diem[];
	// ham xay dunng
	public SinhVien(){
		masv=new String();
		hten=new String();
		ngaysinh=new Date();
		soHP=0;
		tenHP=new String[50];
		diem=new String[50];
	}
	// ham xay dung sao chep
	public void SinhVien(SinhVien s) {
		masv=new String(s.masv);
		hten=new String(s.hten);
		ngaysinh=new Date(s.ngaysinh);
		soHP=s.soHP;
		tenHP=new String[50];
		diem=new String[50];
		for(int i=0;i<s.tenHP.length;i++) {
			tenHP[i]=new String(s.tenHP[i]);
			diem[i]=new String(s.diem[i]);
		}
	}
	public void nhap() {
		System.out.println("nhap ma so sinh vien");
		Scanner sc=new Scanner(System.in);
		masv=sc.nextLine();
		System.out.println("nhap ho ten");
		hten=sc.nextLine();
		System.out.println("nhap ngay thang nam sinh");
		Date d=new Date();
		ngaysinh.nhap();//d.nhap();
		System.out.println("nhap vao so luong mon hoc");
		soHP=sc.nextInt();
		sc.nextLine(); //de bo ki tu enter
		for(int i=0;i<soHP;i++) {
			System.out.println("nhap vao mon hoc thu "+(i+1));
			tenHP[i]=sc.nextLine();
			System.out.println("nhap vao diem HP thu "+(i+1));
			diem[i]=sc.nextLine();
		}
		
	}
	public void in(){
		System.out.println("\n\nmssv: "+masv+"\nnho ten: "+hten+"\nngay sinh: "+ngaysinh+"\nds cac hoc phan");
		for(int i=0;i<soHP;i++) {
			System.out.println(tenHP[i]+"\t"+diem[i]);
		}
	}
	public void themHP(String tenmon, String diemmon) {
		if(soHP<50) {
			tenHP[soHP]=new String(tenmon);
			diem[soHP]=new String(diemmon);
			soHP++;
		}else System.out.println("danh sach hoc phan day ");
	}
	public boolean timHP(String ten) {
		boolean find=false;
		for(int i=0;i<soHP;i++) {
			if(tenHP[i].equals(ten)) {
				find=true;
			} 
		}
		return find;
	}
	public void xoaHP(String ten) {
		if(timHP(ten)==true) {
			int n=0;
			for(int i=0;i<soHP;i++) {
				if(tenHP[i].equals(ten)) {
					n=i;break;
				}
			}
			for(int i=0;i<soHP;i++) {
				tenHP[i]=tenHP[i+1];
				diem[i]=diem[i+1];
			}soHP--;
		}
		else System.out.println("khong co hoc phan trong danh sach");
	}
	public float diemTB() {
		float diemtb=0.0f;
		for(int i=0;i<soHP;i++) {
			if(diem[i].equals("A")||diem[i].equals("a")) {
				diemtb+=4.0;
			}else if(diem[i].equals("B+")||diem[i].equals("b+")) {
				diemtb+=3.5;
			}else if(diem[i].equals("B")||diem[i].equals("b")) {
				diemtb+=3.0;
			}else if(diem[i].equals("C+")||diem[i].equals("c+")) {
				diemtb+=2.5;
			}else if(diem[i].equals("C")||diem[i].equals("c")) {
				diemtb+=2.0;
			}else if(diem[i].equals("D+")||diem[i].equals("d+")) {
				diemtb+=1.5;
			}else if(diem[i].equals("D")||diem[i].equals("d")) {
				diemtb+=1.0;
			}
		}
		return diemtb;
	}
	public String getTen() {
		String a=new String();
		a.substring(a.lastIndexOf(" ")+1);
		return a;
	}
	public String getHoTen() {
		return hten;
	}
}
