package thuchanhonline.lthdt.ctu.edu.vn;

public enum XepLoai {
	gioi("giỏi"),
	kha("khá"),
	trungbinh("trung bình"),
	yeu("yếu");
	private String msg;
	public String getMota() {
		return this.msg;
	}
	XepLoai(String msg){
		this.msg=msg;
	}
	
}


