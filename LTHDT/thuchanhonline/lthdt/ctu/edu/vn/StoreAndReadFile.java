package thuchanhonline.lthdt.ctu.edu.vn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class StoreAndReadFile {
	public static boolean luuFile(ArrayList<String>ds,String path) {
		boolean ok=false;
		try {
			FileOutputStream fos= new FileOutputStream(path);
			OutputStreamWriter osw= new OutputStreamWriter(fos,"utf-8");
			BufferedWriter bw= new BufferedWriter(osw);
			for(String d:ds) {
				bw.write(d);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			ok=true;
			return ok;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	public static ArrayList<String>docFile(String path) {
		ArrayList<String>data=new ArrayList<String>();
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null) {
				if(line.length()>0) {
					data.add(line);
				}
				line=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
