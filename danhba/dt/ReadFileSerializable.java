package danhba.dt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class ReadFileSerializable {
	public static boolean saveFile(ArrayList<DanhBa>dsDB, String path) {
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(dsDB);
			oos.close();
			fos.close();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList <DanhBa>readFile(String path){
		ArrayList <DanhBa>dsDB=new ArrayList<DanhBa>();
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			dsDB=(ArrayList<DanhBa>)data;
			ois.close();
			fis.close();
			return dsDB;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsDB;
	}
}
