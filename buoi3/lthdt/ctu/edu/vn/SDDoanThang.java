package buoi3.lthdt.ctu.edu.vn;

public class SDDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem a=new Diem(3,4);
		Diem b=new Diem(6,8);
		DoanThang ab=new DoanThang(a,b);
		ab.in();
		DoanThang cd= new DoanThang();
		cd.nhap();
		//cd.tinhTuyen(1, 2);
		System.out.println("cd= "+cd.KhoangCach(b));
		System.out.println("cd= "+cd);// van ko ra! chi show ra ten package BOI VI HAM toString viet sai ^^
	}

}
