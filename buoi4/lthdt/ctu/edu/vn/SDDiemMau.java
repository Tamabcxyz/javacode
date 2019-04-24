package buoi4.lthdt.ctu.edu.vn;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau a=new DiemMau();
		a.nhap();
		a.in();
		DiemMau b=new DiemMau();
		b.nhap();
		b.in();
		System.out.println("khoang cach giua 2 diem a va b "+a.khoangCach(b));
	}

}
