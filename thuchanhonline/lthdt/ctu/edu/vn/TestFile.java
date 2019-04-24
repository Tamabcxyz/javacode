package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;

public class TestFile {

	public static void main(String[] args) {
		/*ArrayList<String>dsdata=new ArrayList<String>();
		dsdata.add("chao ban tre");
		dsdata.add("rat vui duoc gap ban");
		dsdata.add("alo alo");
		boolean kq=StoreAndReadFile.luuFile(dsdata,"D:/test.txt");
		if(kq==true) {
			System.out.println("luu thanh cong");
		}
		else System.out.println("luu that bai");
		*/
		ArrayList<String>dsdata= StoreAndReadFile.docFile("D:/test.txt");
		for(String d:dsdata) {
			System.out.println(d);
		}
		

	}

}
