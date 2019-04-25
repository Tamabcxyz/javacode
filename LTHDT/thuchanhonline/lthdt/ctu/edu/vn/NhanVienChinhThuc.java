package thuchanhonline.lthdt.ctu.edu.vn;

public class NhanVienChinhThuc extends NhanVien{
	

	public NhanVienChinhThuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	public void tinhLuong() {// do tinhLuong() cua NhanVien la 1 abstract nen NhanVienChinhThuc phai dinh nghia lai
		System.out.println("nhan vien chinh thuc tinh luong");
	}
}
