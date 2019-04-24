package buoi3.lthdt.ctu.edu.vn;

import buoi2.lthdt.ctu.edu.vn.Date;
import java.util.Scanner;
public class SinhVien {// sinh vien bao gom thuc tinh mssv, ten, ngay sinh, so luong HP dk, ten va diem cua tung hoc phan
	private String mssv;
	private String hten;
	private Date ngaysinh;
	int sluongHP;
	private String []tenHP;// 1 mang cac ten hp
	private String []diem;// tuong ung thi co 1 mang diem
	// ham xay dung ko doi so
	public SinhVien() {// ham xay dung ko doi so
		mssv=new String();
		hten=new String();
		ngaysinh=new Date();
		sluongHP=0;
		tenHP=new String[50];
		diem=new String[50];
	}
	// ham xay dung sao chep
	public SinhVien(SinhVien a) {
		mssv=new String(a.mssv);
		hten=new String(a.hten);
		ngaysinh=new Date(a.ngaysinh);
		sluongHP=a.sluongHP;
		tenHP=new String[50];// cua thay la tenHP=new String(a.tenHP.length) truong trinh ko chap nhan??
		diem=new String[50];
		for(int i=0;i<a.tenHP.length;i++) {
			tenHP[i]=new String(a.tenHP[i]);
			diem[i]=new String(a.diem[i]);
		}
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao ma so sinh vien");
		mssv=sc.nextLine();
		System.out.println("nhap vao ten sinh vien");
		hten=sc.nextLine();
		System.out.println("nhap vao ngay sinh cua sinh vien");
		ngaysinh.nhap();
		System.out.println("nhap vao so luong mon hoc");
		sluongHP=sc.nextInt();
		sc.nextLine(); //de bo ki tu enter
		for(int i=0;i<sluongHP;i++) {
			System.out.println("nhap mon thu "+(i+1));
			tenHP[i]=new String();
			tenHP[i]=sc.nextLine();
			System.out.println("nhap diem mon thu "+(i+1));
			diem[i]=new String(); // khoi tao sau do moi co the nhap vao
			diem[i]=sc.nextLine();
		}
	}
	public void in() {
		System.out.println("mssv: "+mssv+"\nho ten: "+hten+"\nngay sinh: "+ngaysinh+"\nds cac hoc phan");
		for(int i=0;i<sluongHP;i++) {
			System.out.println(tenHP[i]+"\t"+diem[i]);
		}
	}
	public String toString() {
		String s,s1=null;
		s="mssv: "+mssv+"\nho ten: "+hten+"\nngay sinh: "+ngaysinh+"\nds cac hoc phan";
		for(int i=0;i<sluongHP;i++) {
			s1+="\n"+tenHP[i]+"\t"+diem[i];
			//System.out.println(tenHP[i]+"\t"+diem[i]);
		}
		return s+s1;
	}
	public void ThemHP(String mon, String dim) {
		if(sluongHP<50) {// cua thay tenHP.length-1
			tenHP[sluongHP]=new String(mon);
			diem[sluongHP]=new String(dim);
			sluongHP++;
		}else System.out.println("so luong da day");
	}
	public boolean timHP(String ten) {
		boolean find=false;
		for(int i=0;i<sluongHP;i++) {
			if(tenHP[i].equals(ten)) {// tim hoc phan theo ten
				find=true;
			} 
		}
		return find;
	}
	public void XoaHP(String ten) {
		if(timHP(ten)==true) {
			int n=0;
			for(int i=0;i<sluongHP;i++) {
				if(tenHP[i].equals(ten))// tim vi tri xem hp do dang o dau neu tim thay thi tra ve i ngat chuong trinh
					n=i;break;
			}
			for(int i=n;i<sluongHP;i++) {
				tenHP[i]=tenHP[i+1];
				diem[i]=diem[i+1];
			}sluongHP--;
		}else System.out.println("ko co hp nay");
	}
	public float diemTB() {
		float diemtb=0.0f;
		for(int i=0;i<sluongHP;i++) {
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
			}else if(diem[i].equals("F")||diem[i].equals("f")) {
				diemtb+=0.5;
			}
		}
		return diemtb/sluongHP;
	}
	public String getHoTen() {
		return hten;
	}
	public String getTen() {
		String a=new String();
		a=getHoTen();
		a=a.substring(a.lastIndexOf(" ")+1);
		return a;
	}
}




