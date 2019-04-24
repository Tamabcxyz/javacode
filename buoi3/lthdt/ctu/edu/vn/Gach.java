package buoi3.lthdt.ctu.edu.vn;

import java.util.Scanner;
class Gach {
	// Khai bao thuoc tinh bao gom ma, mau, so luong, chieu day, rong, gia ban thi truong
	private String maso;
	private String mau;
	private int soluong;
	private int dai;	// cm
	private int ngang;	// cm
	private long giaban;
	// Ham xay dung
	public Gach() {	// Ham XD mac nhien
		maso = new String();
		mau = new String();
		soluong = 0;
		dai = ngang = 0;
		giaban = 0;
	}
	public Gach(String ms, String m, int sl, int d, int ng, long gb) {
		maso = new String(ms);
		mau = new String(m);
		soluong = sl;
		dai = d;
		ngang = ng;
		giaban = gb;
	}
	public Gach(Gach g) {	// Ham xay dung sao chep
		maso = new String(g.maso);
		mau = new String(g.mau);
		soluong = g.soluong;
		dai = g.dai;
		ngang = g.ngang;
		giaban = g.giaban;
	}

	// Ham sao chep sau
	public void makeCopy(Gach g) {
		maso = g.maso;
		mau = g.mau;
		soluong = g.soluong;
		dai = g.dai;
		ngang = g.ngang;
		giaban = g.giaban;
	}

	// Cac phuong thuc
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maso = kb.nextLine();
		System.out.print("Nhap mau: ");
		mau = kb.nextLine();
		System.out.print("Nhap so luong vien: ");
		soluong = kb.nextInt();
		System.out.print("Nhap chieu dai vien gach: ");
		dai = kb.nextInt();
		System.out.print("Nhap chieu ngang vien gach: ");
		ngang = kb.nextInt();
		System.out.print("Nhap gia ban 1 hop: ");
		giaban = kb.nextLong();
	}
	public void hienThi() {
		System.out.println("Gach " + maso + " mau " + mau
			+ " kich thuoc " + dai + "x" + ngang + "cm co "
		    + soluong + " vien/hop gia " + giaban + " dong");
	}
	public float giaBanLe() {
		return (float)1.2*giaban/soluong;
	}
	public int dienTich() {	// cm2
		return (dai*ngang*soluong);// dien tich cua nen nha neu lot loai gach nay
	}
	public int soluongHop(int D, int N) {
		int sovienngang = N/ngang;// N la chieu rong cua san, ngang la chieu rong cua vien gach
		if(N%ngang!=0)	sovienngang++;// neu chieu rong cua san chia du cho ngang khac 0==>chua du lot==> can them gach
		int soviendai = D/dai;// D la chieu day cua san
		if(D%dai!=0) soviendai++;
		int tongsovien = sovienngang*soviendai;
		int sohop = tongsovien / soluong;
		if(tongsovien%soluong!=0) sohop++;
		return sohop;
	}

	// GETTER
	public String layMaSo() {
		return maso;
	}

	public int laySoLuong() {
		return soluong;
	}

	public long layGiaBan() {
		return giaban;
	}

}