package thuchanhonline.lthdt.ctu.edu.vn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class conventstringtodate {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");// dinh dang SimpleDateFormat thanh dang nay
	public static Date formString(String d) {// doc vao 1 chuoi tra ve kieu Date
		try {
			Date date=sdf.parse(d);// dung dinh dang cua SimpleDateFormat de ep chuoi ve dung dinh dang
			return date;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;// neu ko ep duoc thi tra ve null
	}
	public static String formDate(Date d) {
		return sdf.format(d);// chuyen Date thanh chuoi
	}
}
