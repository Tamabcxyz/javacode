package thuchanhonline.lthdt.ctu.edu.vn;

public class SDNhanVien1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien1 nv1=new NhanVien1();
		nv1.nhap();
		NhanVien1 nv2=new NhanVien1();
		nv2.nhap();
		nv1.xuat();
		System.out.println("luong cua nhan vien 1 la: "+nv1.getLuong());
		nv2.xuat();
		System.out.println("luong cua nhan vien 1 la: "+nv2.getLuong());
		// so sanh nhan vien nao lon hon va so luong lon hon la bao nhieu
		if(nv1.lonHon(nv2)) {
			System.out.println("nhan vien 1 lon hon nhan vien 2 cu the la "+(nv1.getSoSP()-nv2.getSoSP())+" san pham");
		}
		else {
			System.out.println("nhan vien 2 lon hon nhan vien 1 cu the la "+(nv2.getSoSP()-nv1.getSoSP())+" san pham");
		}
	}

}
