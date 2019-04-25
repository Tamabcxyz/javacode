package thuchanhonline.lthdt.ctu.edu.vn;

public class TestThrow {
 public static void Ptb1(int a, int b) throws Exception {// throws quang loi ra cho cac ham goi toi no xu ly loi
	 try {
		 float c=0.0f;c=(float)(-b*1.0/a);// do a va b la so nguyen ne kq la fep chia nguyen b*1.0 de bien b thanh so thuc va ep kieu ve thuc
		 System.out.println("x="+c);
	 }catch(Exception e) {
		 throw e;
	 }
 }
 public static void main(String args[]) {
	 try {
		Ptb1(2,3);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
