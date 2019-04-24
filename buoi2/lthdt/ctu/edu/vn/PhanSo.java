package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class PhanSo {
	// Khai bao thuoc tinh cua phan so gom tu so va mau so
		private int tu;
		private int mau;
		// Ham xay dung ko doi so
		public PhanSo() {
			tu = 0; mau = 1;// khoi tao gia tri ban dau cho tu so mau so
		}
		// ham xay dung co doi so
		public PhanSo(int t, int m) {
			this.tu = t; this.mau = m;
			if(m==0) {
				System.out.println("Gia tri mau so khong hop le");// mau so =0 la loi, khi do khoi tao lai gia tri ban dau
				tu = 0; mau = 1;
			}
		}
		public PhanSo(float x) {	// Viet them
			// Tu bo sung them
		}

		public PhanSo(PhanSo p) {	// Ham XD sao chep
			tu = p.tu;
			mau = p.mau;
		}

		// Cac phuong thuc
		public void makeCopy(PhanSo p) {	// Ham sao chep sau
			tu = p.tu;
			mau = p.mau;
		}
		public void toiGian() {
			int usc = MyTool.uscln(tu,mau);// MyTool la class co phuong thuc la uscln(tu,mau)
			tu /= usc;// chia cho uscln de rut ron 
			mau /= usc;// tuong tu tren
		}
		public void nhap() {
			while(true) {// vong lap vo tan
				Scanner kb = new Scanner(System.in);
				System.out.print("Nhap tu so: ");
				tu = kb.nextInt();
				System.out.print("Nhap mau so: ");
				mau = kb.nextInt();
				if(mau!=0) break;// neu ma hop le thi ngat vong lap
				System.out.println("Gia tri nhap khong hop le - Nhap lai.");// neu mau so la 0 thi nhap lai
			}
		}

		public void hienThi() {
			if(tu==0) {// 0 chia may cung la o
				System.out.print("0"); return;
			}
			if(mau==1) {// mau la 1 thi kq=tu
				System.out.print(tu); return;
			}
			if(tu*mau<0)// tu nhan mau ra am thi phan so them dau -
				System.out.print("-");
			System.out.print(Math.abs(tu) + "/" + Math.abs(mau));
		}
		public void nghichDao() {	// Nghich dao ban than phan so
			if(tu==0) {
				System.out.println("Khong nghich dao duoc");// neu tu =0 khi ko the nghich dao
				return;
			}
			int t = tu;// tao bien tam hoan doi tu mau cho nhau
			tu = mau;
			mau = t;
		}
		public PhanSo giaTriNghichDao() {	// Tao ra phan so nghich dao
			if(tu==0) {
				System.out.println("Khong tao ra phan so nghich dao duoc");
				return new PhanSo(0,1);
			}
			return new PhanSo(mau,tu);// nghich dao chi la doi tu cho mau
		}
		public float giaTriThuc() {
			return (float)tu/mau;// ep ve so thuc
		}
		public PhanSo cong (PhanSo a) {
			PhanSo kq;// tao bien kq co kieu phan so
			kq = new PhanSo( tu*a.mau + mau*a.tu , mau*a.mau);// thuc hien qui dong
			kq.toiGian();// rut gon
			return kq;// tra ve kq kieu phan so
		}
		public PhanSo tru (PhanSo a) {
			PhanSo kq;
			kq = new PhanSo( tu*a.mau - mau*a.tu , mau*a.mau);// thuc hien qui dong
			kq.toiGian();// rut gon
			return kq;// tra ve ket qua

		}
		public PhanSo nhan (PhanSo a) {
			PhanSo kq;
			kq = new PhanSo( tu*a.tu , mau*a.mau);
			kq.toiGian();
			return kq;
		}
		public PhanSo chia (PhanSo a) {
			PhanSo kq;
			kq = new PhanSo( tu*a.mau , mau*a.tu);
			kq.toiGian();
			return kq;
		}
		public boolean lonHon(PhanSo a) {
			return (tu*a.mau > mau*a.tu);
		}

		// GETTER
		public int giaTriTu() { return tu; }
		public int giaTriMau() { return mau; }
}
