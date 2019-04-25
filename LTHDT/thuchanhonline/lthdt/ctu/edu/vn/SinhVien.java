package thuchanhonline.lthdt.ctu.edu.vn;


public class SinhVien {
	private String ten;
	private float diem;
	private int ma;
/*	public SinhVien() {
		this.ten="Obama";
	}
	public SinhVien(String ten,float diem) {
		this();// goi contructor SinhVien()
		this.diem=1;
	}
	public SinhVien(String ten,float diem, int ma) {
		this(ten,diem);// goi contructor SinhVien(ten,diem)
		this.ma=ma;
	}
*/
	// HOC ALIAS VA CO CHE DON RAC TRONG JAVA
	
	public SinhVien() {
		this.ma=0000;
		this.ten="";
	}
	public SinhVien(int ma,String ten) {
		this.ma=ma;
		this.ten=ten;
	}
	public void setTen(String ten) {
		this.ten=ten;
	}
	public String getTen() {
		return this.ten;
	}
	public void setma(int ma) {
		this.ma=ma;
	}
	public int getMa() {
		return this.ma;
	}
	public SinhVien(SinhVien a) {
		this.ma=a.ma;
		this.ten=a.ten;
	}
	public String toString() {
		return this.ma+"\t"+this.ten;
	}
	
}
