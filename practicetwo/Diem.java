package practicetwo;

import java.util.Scanner;

public class Diem {
	private int x,y;
	public Diem() {
		x=0;y=0;
	}
	public Diem(Diem A) {
		x=A.x;
		y=A.y;
	}
	public void Diem(int a, int b) {
		x=a;y=b;
	}
	public void nhapDiem() {
		System.out.println("nhap vao toa do cua x va y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public void hienThi() {
		System.out.print("("+x+","+y+")");
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public float khoangCach() {
		return (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	public float khoangCach(Diem d) {
		return (float)Math.sqrt((d.x-x)*(d.x-x)+(d.y-y)*(d.y-y));
	}
	public void tinhTuyen(int dx, int dy) {
		x=x+dx;y=y+dy;
	}
	public void doiXung() {
		x=-x;y=-y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
