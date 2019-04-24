package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;

public class SDTextFile {

	public static void main(String[] args) {
		/*ArrayList<String>dsdata=new ArrayList<String>();
		dsdata.add("obama");
		dsdata.add("alo alo");
		dsdata.add("donal trump");
		boolean kq=TextFileFactory.luuFile(dsdata,"D:/javatext.txt");
		if(kq==true) {
			System.out.println("file luu thanh cong");
		}else System.out.println("file luu that bai");*/
		ArrayList<String>sddata=TextFileFactory.docFile("D:/javatext.txt");
		for(String data:sddata) {
			System.out.println(data);
		}
	}
	
}
