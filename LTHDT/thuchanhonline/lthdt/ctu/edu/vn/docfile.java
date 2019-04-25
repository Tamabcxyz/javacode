package thuchanhonline.lthdt.ctu.edu.vn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;



public class docfile {
	public static boolean saveFile(ArrayList<KhachHang>ds,String path) {// saveFile la mot danh sach KhachHang, luu vao duong dan path, neu luu dc thi tra ve true
		try {
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for(KhachHang kh:ds) {
				String line=kh.getMa()+";"+kh.getTen()+";"+conventstringtodate.formDate(kh.getNamsinh());
				bw.write(line);// viet vao cai line
				bw.newLine();// tao dong moi
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public static ArrayList<KhachHang>docFile1(String path){
		ArrayList <KhachHang>dskh=new ArrayList<KhachHang>(); 
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();// doc thu dong dau tien
			while(line !=null) {// neu khac null moi doc 
				String arr[]=line.split(";");// tach ma, ten, nam sinh thong qua dau ";"
				if(arr.length==3) {
					KhachHang kh=new KhachHang();
					kh.setMa(Integer.parseInt(arr[0]));
					kh.setTen(arr[1]);
					kh.setNamsinh(conventstringtodate.formString(arr[2]));
					dskh.add(kh);
				}
				line =br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dskh;
		
	}
}
