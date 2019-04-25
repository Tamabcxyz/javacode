package homework;

import java.util.Scanner;

public class HoaDon {
	private String ID, TenHoaDon;
	private Date ngaylap;
	private DienTieuDung KW;
	private KhachHang h;
	public HoaDon() {
		ID=new String();
		TenHoaDon=new String();
		ngaylap=new Date();
		h=new KhachHang();
		KW=new DienTieuDung();
	}
	public HoaDon(String id,String Ten, Date d) {
		this.ID=id;
		this.TenHoaDon=Ten;
		this.ngaylap=d;
		
		
		
		
		
		h=new KhachHang();// tai sao lai ko khoi tao doi tuong trong day???
		KW=new DienTieuDung();// tuong tu
		
		
		
		
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ID: ");
		ID=sc.nextLine();
		System.out.println("nhap Ten Hoa DOn:");
		TenHoaDon=sc.nextLine();
		ngaylap.nhap();
		
		h.nhap();
	
		KW.nhap();
		
	}
	public void in() {
		System.out.println("id hoa don:"+ID+"\n Ten hoa Don: "+TenHoaDon+"\n ngay lap: "+ngaylap);
		h.in();
		KW.in();
		System.out.println("Thanh Tien:"+KW.ThanhTien());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoaDon h=new HoaDon();
		h.nhap();
		h.in();
	}

}
