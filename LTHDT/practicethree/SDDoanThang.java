package practicethree;

public class SDDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoanThang d=new DoanThang();
		d.nhapDoanThang();
//		d.inDoanThang();
		System.out.print("\nin ra doi tuong d ne\n"+d);
		d.tinhTuyenDoanThang(1, 1);
		System.out.println("\ndoan thang sau khi duoc tinh tuyen la: ");
		d.inDoanThang();
		
	}

}
