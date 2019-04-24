package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.StringTokenizer;

//import java.util.Random;
public class HocStringBuilder33 {
	
		public static void main(String args[]) {
//			StringBuilder s=new StringBuilder();
//			s.append("Tran\n");
//			s.append("Minh\n");
//			s.append("Tam");
//			s.insert(10,"chao ban");
//			s.delete(0,3);
//			String a=s.toString();
//			System.out.println(a);
			
			
			String s="chao ban minh xin loi";
			StringTokenizer st=new StringTokenizer(s," ");// tach chuoi s qua khoang trang " "
			
			while(st.hasMoreTokens()){
				String value=st.nextToken();
				System.out.println(value);
			}
			String a="thong;bao;cua;     obama";
			StringTokenizer ss=new StringTokenizer(a,";");// tach chuoi a theo dau ";"
			while(ss.hasMoreTokens()) {
				String cc=ss.nextToken();
				System.out.println(cc);
			}
		}

}
