package buoi3.lthdt.ctu.edu.vn;

public class SDDiem {
	public static void main(String args[]) {
		Diem a=new Diem(3,4);
		Diem b=a;// doi tuong b dang dc gan bang doi tuong a
		b.in();
		a.in();
		Diem c=new Diem(a);// doi tuong c dang goi ham xay dung sao chep
		c.in();
		b.gan(5,3);
		System.out.println("sau khi gan");
		b.in();
		a.in();
		c.in();
		
	}
}
