package thuchanhonline.lthdt.ctu.edu.vn;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.util.ArrayList;
public class TextFileFactory {
	public static boolean luuFile(ArrayList <String>dsdata, String path) {
		try {
			FileOutputStream f=new FileOutputStream(path);
			OutputStreamWriter fw=new OutputStreamWriter(f,"UTF-8");
			BufferedWriter bw=new BufferedWriter(fw);
			for(String data:dsdata) {
				bw.write(data);
				bw.newLine();
			}
			bw.close();
			fw.close();
			f.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	public static ArrayList<String>docFile(String path){
		ArrayList<String> dsdata=new ArrayList<String>();
		try {
			FileInputStream f1=new FileInputStream(path);
			InputStreamReader fr=new InputStreamReader(f1,"UTF-8");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null) {
				if(line.length()>0) {
					dsdata.add(line);
					line=br.readLine();
				}
			}
			br.close();fr.close();f1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsdata;
		
	}
}
