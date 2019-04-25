package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Diem {// diem gom 2 thuoc tinh la x va y
	private int x,y;
	// ham xay dung ko doi so
	public Diem() {// tuyet doi ham xay dung ko can kieu tra ve
		x=0;y=0;// khoi tao gia tri ban dau
	}
	public void Diem(int x1, int y1) {// tai sao o day ko de void lai bi loi o class SDDiem??
		x=x1;y=y1;
	}
	public void gan(int x1, int y1) {
		x=x1;y=y1;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao x");
		x=sc.nextInt();
		System.out.println("nhap vao y");
		y=sc.nextInt();
	}
	public void in() {
		System.out.println("toa do cua diem la\t"+x+","+y);
	}
	public int layX() {
		return x;
	}
	public int layY() {
		return y;
	}
	public void tinhTien(int dx, int dy) {
		x=x+dx;y=y+dy;// tinh tuyen don gian chi cong them vao x, y mot do lenh nao do
	}
	public float khoangCach(){
		return (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));// su dung cong thuc pitago
	}
	public float khoangCach(Diem B) {
		return (float)Math.sqrt((x-B.x)*(x-B.x)+(y-B.y)*(y-B.y));
	}
	
}
