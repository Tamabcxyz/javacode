package buoi2.lthdt.ctu.edu.vn;

public class SDDiem {
	public static void main(String args[]) {
		Diem a=new Diem();
		a.Diem(5, 6);
		a.in();
		Diem b=new Diem();
		b.nhap();
		b.in();
		System.out.println("khoan cach toi goc toa do la "+a.khoangCach());// khoan cach tu diem a toi goc toa do
		System.out.println("ab co khoan cach la "+a.khoangCach(b));// khoan cach tu diem toi 1 diem
//		b.tinhTien(1, 2);
//		b.in();
//		Diem c=new Diem();
//		c.Diem(-b.layX(), -b.layY());// ta ko the . toi x va y vi do la thuoc tinh rieng cua class Date muon lay thi phai viet ham getX()
//		c.in();
	}
	
}
