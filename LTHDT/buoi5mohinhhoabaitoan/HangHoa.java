package buoi5mohinhhoabaitoan;


import java.util.Scanner;

public class HangHoa {
	private String id,ten,nsx;
	public HangHoa() {
		this.id=new String();
		this.ten="";// cai nay thay the cho new String() dc
		this.nsx="";
	}
	public void HangHoa(HangHoa h) {
		this.id=new String(h.id);
		this.ten=new String(h.ten);
		this.nsx=new String(h.nsx);
	}
	public void nhap() {
		System.out.println("nhap vao id san pham:");
		this.id=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ten san pham:");
		this.ten=new Scanner(System.in).nextLine();
		System.out.println("nhap vao ngay san xuat:");
		this.nsx=new Scanner(System.in).nextLine();
	}
	public void in() {
		System.out.println("id"+this.id+" ten sp "+this.ten+" ngay san xuat "+this.nsx);
	}
	public String toString() {
		return "id"+this.id+" ten sp "+this.ten+" ngay san xuat "+this.nsx;
	}
}
