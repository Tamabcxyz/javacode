package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSinhVien1 {

	public static void main(String[] args) {
		ArrayList<SinhVien1>ds=new ArrayList<SinhVien1>();
		ds.add(new SinhVien1(1,"Tam",2.5));
		ds.add(new SinhVien1(2,"Thanh",9.5));
		ds.add(new SinhVien1(3,"Tuan",6.7));
		ds.add(new SinhVien1(4,"Tu",5.5));

		for(SinhVien a:ds) {
			System.out.println(a);
		}

	}

}
