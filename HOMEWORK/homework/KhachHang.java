package homework;

import java.util.Scanner;
public class KhachHang {
	private String maKH, HoTen, DiaChi;
	public KhachHang() {
		maKH=new String();
		HoTen=new String();
		DiaChi=new String();
	}
	public KhachHang(String id,String name, String Dc) {
		this.maKH=id;
		this.HoTen=name;
		this.DiaChi=Dc;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ma so Khach Hang:");
		maKH=sc.nextLine();
		System.out.print("Nhap HoTen Khach Hang:");
		HoTen=sc.nextLine();
		System.out.print("Nhap dia chi Khach Hang:");
		DiaChi=sc.nextLine();
		}
	public final String getMaKH() {
		return maKH;
	}
	public final void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public final String getHoTen() {
		return HoTen;
	}
	public final void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public final String getDiaChi() {
		return DiaChi;
	}
	public final void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public void in() {
		System.out.print("maKH: "+maKH+"\n---"+" Ho va ten khach hang: "+HoTen+"\n---"+" Dia chi khach hang: "+DiaChi);
	}
	public String toString() {
		return "maKH: "+maKH+"---"+" Ho va ten khach hang: "+HoTen+"---"+" Dia chi khach hang: "+DiaChi;
	}
	
}
