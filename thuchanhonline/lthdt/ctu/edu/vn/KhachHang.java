package thuchanhonline.lthdt.ctu.edu.vn;

import java.io.Serializable;
import java.util.Date;

public class KhachHang implements Serializable{
	private String ten;
	private int ma;
	private Date namsinh;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public Date getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(Date namsinh) {
		this.namsinh = namsinh;
	}
	public KhachHang( int ma,String ten, Date namsinh) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.namsinh = namsinh;
	}
	public KhachHang() {
		super();
	}
	public String toString() {
		return this.ma+"-"+this.ten+"-"+conventstringtodate.formDate(this.namsinh);
	}
	
}
