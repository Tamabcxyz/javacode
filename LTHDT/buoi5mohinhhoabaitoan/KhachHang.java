package buoi5mohinhhoabaitoan;




import java.util.Scanner;

import buoi2.lthdt.ctu.edu.vn.Date;


public class KhachHang {
	private String mskh;
	private String htenkh;
	private Date ngaysinhkh;
	private HoaDon hd[];
	
	public KhachHang(KhachHang h) {
		mskh=new String(h.mskh);
		htenkh=new String(h.htenkh);
		ngaysinhkh=new Date(h.ngaysinhkh);
		hd=new HoaDon [50];// chi moi tao 50 bien tham chieu ma thoi
		for(int i=0;i<h.hd.length;i++) {
			hd[i]=new HoaDon(h.hd[i]);
		}
		
	}

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String mskh, String htenkh, Date ngaysinhkh, HoaDon[] hd) {
		super();
		this.mskh = mskh;
		this.htenkh = htenkh;
		this.ngaysinhkh = ngaysinhkh;
		this.hd = hd;
	}

	public String getMskh() {
		return mskh;
	}

	public void setMskh(String mskh) {
		this.mskh = mskh;
	}

	public String getHtenkh() {
		return htenkh;
	}

	public void setHtenkh(String htenkh) {
		this.htenkh = htenkh;
	}

	public Date getNgaysinhkh() {
		return ngaysinhkh;
	}

	public void setNgaysinhkh(Date ngaysinhkh) {
		this.ngaysinhkh = ngaysinhkh;
	}

	public HoaDon[] getHd() {
		return hd;
	}

	public void setHd(HoaDon[] hd) {
		this.hd = hd;
	}
	public void nhap() {
		System.out.println("nhap vao ma khach hang");
		mskh=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ho ten khach hang");
		htenkh=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ngay thang nam sinh cua khach hang");
		ngaysinhkh.nhap();
		System.out.println("nhap hoa don");
		System.out.println("nhap so luong hoa don");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("nhap hoa don thu "+(i+1));
			hd[i]=new HoaDon();
			hd[i].nhap();
		}
	}
	public void xuat() {
		System.out.println("ma kh: "+this.mskh+" ten kh: "+this.htenkh+" ngay thang nam sinh kh: "+this.ngaysinhkh.toString());
		for(int i=0;i<hd.length;i++) {
			System.out.println(hd[i]);
		}
	}
	public String toString() {// that su ko biet viet haizz!
		String s;
		HoaDon s1=null;
		s="ma kh: "+this.mskh+" ten kh: "+this.htenkh+" ngay thang nam sinh kh: "+this.ngaysinhkh.toString();
		for(int i=0;i<hd.length;i++) {
			s1=hd[i];
		}
		return s+s1;
	}
	
	
}
