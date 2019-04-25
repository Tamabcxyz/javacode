package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class BaiTapTachSoAmTrongChuoi {
	public static boolean ktrso(char s) {
		boolean kq=false;
			if(s>=48&&s<=57) {
				kq=true;
			}else kq=false;
		return kq;
	}
	
	public static void soAmTrongChuoi(String s) {
		char c[]=s.toCharArray();
		char temp[]=new char[20];
		for(int i=0;i<c.length;i++) {
			int cuoi=0;int dau;
			if(c[i]=='-') {
				dau=i;
				if(ktrso(c[i+1])==true) {
					i++;
					cuoi=i;
				}
					
				
				for(int j=0;j<c.length;j++) {
					s.getChars(dau, cuoi, temp, 0);
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("nhap vao chuoi xem co so am trong chuoi hay khong");
		//Scanner sc=new Scanner(System.in);
		String s="abc-5xyz-22k91--p";
/*		s=s.replaceAll("[^0-9,-\\.]", ",");
		String a[]=s.split(",");
		for(int i=0;i<a.length;i++) {
			try {
				if(a[i].charAt(0)=='-') {
					Integer.parseInt(a[i]);
					System.out.println(a[i]);
				}
			}catch(Exception e) {
				
			}
			
		}
*/
		soAmTrongChuoi(s);
	}

}
