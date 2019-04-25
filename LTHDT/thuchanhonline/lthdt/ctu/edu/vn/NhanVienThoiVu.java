package thuchanhonline.lthdt.ctu.edu.vn;

public class NhanVienThoiVu extends NhanVien {
	public void tinhLuong() {//do tinhLuong() cua NhanVien la 1 abstract nen NhanVienThoiVu phai dinh nghia lai
		System.out.println("nhan vien thoi vu tinh luong");
	}

	public NhanVienThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}
}
