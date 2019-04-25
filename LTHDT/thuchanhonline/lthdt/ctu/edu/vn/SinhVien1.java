package thuchanhonline.lthdt.ctu.edu.vn;

public class SinhVien1 extends SinhVien{
	private double diemTB;
	private XepLoai loai;
	
	public SinhVien1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien1(int ma, String ten,double diemTB) {
		super(ma, ten);
		this.diemTB = diemTB;
		this.loai=kqloai();
		// TODO Auto-generated constructor stub
	}
	public SinhVien1(SinhVien a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public XepLoai kqloai() {
		if(this.diemTB>=8) {
			loai=XepLoai.gioi;
		}
		else if(this.diemTB>6.5&&diemTB<=8) {
			loai=XepLoai.kha;
		}
		else if(this.diemTB>5&&diemTB<6.5) {
			loai=XepLoai.trungbinh;
		}
		else {
			loai=XepLoai.yeu;
		}
		return loai;
	}
	public String toString() {
		String s=super.toString();
		return s+" \tDiem TB "+this.diemTB+" \txep loai: "+this.loai.getMota();
	}
	
}
