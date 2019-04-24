package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SDSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham>ds=new ArrayList<SanPham>();
		ds.add(new SanPham(1,"tra xanh",10.5));
		ds.add(new SanPham(2,"tra da",15.5));
		ds.add(new SanPham(3,"tra dao",20.3));
		// loi that stupid luc truoc ngu dung for chay co, ngu qua, cai nay dau can dung for haizz
		Collections.sort(ds);
		System.out.println("sau khi sap xep ta dc");
		for(SanPham i:ds) {
			System.out.println(i);
		}
	}

}
