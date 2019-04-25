package buoi5.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class HangHoa {
	private String id, ten, nxs;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNxs() {
		return nxs;
	}

	public void setNxs(String nxs) {
		this.nxs = nxs;
	}

	public HangHoa() {
		super();
	}

	public HangHoa(String id, String ten, String nxs) {
		super();
		this.id = id;
		this.ten = ten;
		this.nxs = nxs;
	}
	public HangHoa(HangHoa h) {
		this.id=new String(h.id);
		this.ten=new String(h.ten);
		this.nxs=new String(h.nxs);
	}
	public void nhap() {
		System.out.println("nhap vao id san pham");
		this.id=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ten san pham");
		this.ten=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ngay san xuat");
		this.nxs=new Scanner(System.in).nextLine();
	}
	public void in() {
		System.out.println("id "+this.id+" ten sp "+this.ten+" ngay san xuat "+this.nxs);
	}
	public String toString() {
		return "id "+this.id+" ten sp "+this.ten+" ngay san xuat "+this.nxs;
	}
}
