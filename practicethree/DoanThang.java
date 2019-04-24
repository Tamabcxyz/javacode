package practicethree;
import practicetwo.*;
public class DoanThang {
	private Diem d1,d2;
	public DoanThang() {
		d1=new Diem();
		d2=new Diem();
	}
	public void DoanThang(Diem a, Diem b) {
		d1=new Diem(a);
		d2=new Diem(b);
	}
	public void DoanThang(int ax,int ay, int bx, int by) {
		d1.Diem(ax,ay);
		d2.Diem(bx,by);
	}
	public void DoanThang(DoanThang d) {
		d1=new Diem(d.d1);
		d2=new Diem(d.d2);
	}
	public void makeCopy(DoanThang d) {
		d1=new Diem(d.d1);
		d2=new Diem(d.d2);
	}
	public void nhapDoanThang() {
		System.out.println("toa do diem thu 1:");
		d1.nhapDiem();
		System.out.println("toa do diem thu 2:");
		d2.nhapDiem();
	}
	public void inDoanThang() {
		System.out.print("[");d1.hienThi();System.out.print(",");d2.hienThi();System.out.print("]");
	}
	public String toString() {
		return "["+d1+","+d2+"]";
	}
	public void tinhTuyenDoanThang(int dx, int dy) {
		d1.tinhTuyen(dx, dy);
		d2.tinhTuyen(dx, dy);
	}
	public float khoanCach() {
		return d1.khoangCach(d2);
	}
	
	
	
}
