package thuchanhonline.lthdt.ctu.edu.vn;

public class SDABC {

	public static void main(String[] args) {
		ABC value=new ABC();
		value.setA(113);
		ABC value1=new ABC();
		System.out.println(value1.getA());
		value1.setA(114);
		System.out.println(value.getA());
		ABC.funtion1();// vi day la phuong thuc static nen co the dung ten lop cham phuong thuc
		ABC key=new ABC();
		key.funtion2();// funtion2 chi dc goi khi doi tuong da duoc tao
	}

}
