package practicetwo;

public class SDDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem d=new Diem();
		d.nhapDiem();
		d.hienThi();
		Diem d1=new Diem();
		d1.Diem(-d.giaTriX(),-d.giaTriY());
		d1.hienThi();
		
	}

}
