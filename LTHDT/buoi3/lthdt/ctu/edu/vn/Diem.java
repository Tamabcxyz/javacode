package buoi3.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Diem {
	private int x,y;// diem co toa do x va y
	// ham xay dung ko doi so
	public Diem() {
		x=0;y=0;
	}
	//ham xay dung co doi so
	public Diem(int x, int y) {
		this.x=x; this.y=y;
	}
	public void nhap() {
		System.out.println("nhap vao toa do x va y");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();y=sc.nextInt();
	}
	public void in() {
		System.out.println("("+x+","+y+")");// in chi don gian in ra toa do x va y thoi
	}
	public Diem(Diem obj) {// ham sao chep sau
		x=obj.x;
		y=obj.y;
	}
	public void gan(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int layX() {
		return x;
	}
	public int layY() {
		return y;
	}
	// dung  de xuat 1 doi tuong trong s.o.p
	public String toString() {
		return "("+x+","+y+")";
	}
	// tinh tuyen la cong them do doi vao x va y
	public void tinhTuyen(int dx, int dy) {
		// TODO Auto-generated method stub
		x=x+dx;y=y+dy;
	}
	
	public float khoangCach(Diem d1) {
		// TODO Auto-generated method stub
		return (float)Math.sqrt((x-d1.x)*(x-d1.x)+(y-d1.y)*(y-d1.y));
	}
	
	
}
