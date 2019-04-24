package practicetwo;

public class SDDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		d.nhap();
		d.in();
		d=d.ngayHomSau();
		System.out.println(d);
		d=d.congNNgay(5);
		System.out.println(d);
	}

}
