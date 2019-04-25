 package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Ucln {
	private int a, b;
	public Ucln() {// ham xay dung ko doi so
		a=0;b=0;
	}
	public Ucln(int a1, int b1) {// ham xay dung co doi so
		this.a=a1;this.b=b1;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao a");
		a=sc.nextInt();
		System.out.println("nhap vao b");
		b=sc.nextInt();
	}
	public int cach1Ucln(int a, int b) {
		int kq=0;
		for(int i=1; i<=a||i<=b;i++) {// chay tu dau den a hoac b
			if(a%i==0&&b%i==0) {// neu 2 so a va b cung chia het cho 1 so thi tra ve ket qua cuoi cung tim dc
				kq=i;
			}
		}
		return kq;
	}
	public int cach2Ucln(int a, int b) {
		Ucln d=new Ucln();
		d.a=this.a;
		d.b=this.b;
		if(d.a==0||d.b==0) {// neu 1 trong 2 so la 0 thi ucln la so con lai
			return d.a+d.b;
		}
		while(d.a!=d.b) {// trong khi 2 so a va b khac nhau
			if(d.a>d.b) {
				d.a=d.a-d.b;	/*thuc hien phep tru cho toi khi 2 so bang nhau*/
			}else d.b=d.b-d.a;
		}
		return d.a;
	}
	public void in() {
		System.out.println("UCLN cua 2 so a b la: "+cach2Ucln(a,b));
	}
}
