package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;

public class TextChuoi {

	// vd  tao phuong thuc lay doi day cua chuoi
//	public static int length1(String a) {
//		int dem=0;
//		char s[]=a.toCharArray();
//		for(int i=0;i<s.length;i++) {
//			dem++;
//		}
//		return dem;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="   chao ban minh la tam day tam co tam va tam rat thich ban! ";
//		System.out.println("vi tri dau tien duoc tim thay la "+a.indexOf("a"));
//		System.out.println("vi tri cuoi cung dc tim thay la "+a.lastIndexOf("a"));
//		System.out.println("chuoi 'tam' co trong chuoi a hay khong "+a.contentEquals(a));
//		System.out.println(a.replaceFirst("tam", "thanh"));
//		System.out.println(a.length());
//		a=a.trim();
//		System.out.println(a.length());
//		System.out.println(a);
		
//		String s=new String();
//		s="abao ban";
//		String a="abaao ban";
//		int kq=a.compareTo(s);
//		System.out.println("kq la 0 neu 2 chuoi bang nhau, kq la >0 neu chuoi 1 lon hon chuoi 2, kq bang <0 neu chuoi 1 nho hon chuoi 2\n"+kq);
	
	
//		StringBuilder s=new StringBuilder();
//		s=s.append("chao ban minh la ngu van ngoc va lam van bien");
//		System.out.println(s);
//		s.insert(4,"cho");
//		System.out.println("sau khi insert tao duoc "+s);
//		s.delete(4, 7);
//		System.out.println(s);
//		s.replace(0,14,"Tam ");
//		System.out.println(s);
//		s.reverse();
//		System.out.println(s);
//		String a="chao ku";
//		a.concat(a);
//		System.out.println(a);
//		String c=new String();c=s.substring(0);
//		System.out.println(c);
		
//		String a=new String("chao con cho ngu ngoc ");
//		String b=new String("chao dai ngoc ngu ku nho ");
//		String c="";
//		c=a+b;
//		System.out.println(c);
		
//		StringBuilder bd=new StringBuilder();
//		String s="chao ban ngu ngoc ";
//		bd.append(s);
//		bd.append(" con nai ngoi canh con chon");
//		s=s.concat("cho cho");
//		System.out.println(s);
//		System.out.println(bd.toString());
		
//		String s="chao may tao la obama day co ho";
//		String a[]=s.split("\\s");
//		for(String key:a) {
//			System.out.println(key);
//		}
		
		
		
//		// bai tap chuan hoa chuoi ki tu trong java
//		String s="            !			chao       may tao la obama";
//		s=s.trim();
//		System.out.println(s);
//		for(int i=0;i<s.length();i++) {
//			s=s.replaceAll("\\s+"," ");
//		}System.out.println(s);
		
		
		
		// cat bo khoan trang dau chuoi
/*		String s="        chao m tao la Tam";
	int vtrai=0;int i=0;
	for(i=0;i<s.length();i++) {
		char c=s.charAt(i);
			if(c==32) {
				vtrai=i;
			}else break;
	}s=s.substring(i);
	System.out.println("sau khi xoa ta dc\n"+s);
*/		
		// ham splip trong java
//		String a="chao may tao la tam dep trai nhat he mat troi day";
//		String s[]=a.split(" ");
//		for(int i=0;i<s.length;i++) {
//			System.out.println(s[i]);
//		}
//		for(String c:s) {
//			System.out.println(c);
//		}
		
		// vd lay ten bai hat tu duong dan sau "D:/tapin/nhac/Iloveu.mp4"
//		String duongdan="D:/tapin/nhac/Iloveu.mp4";
//		String ten=duongdan.substring(duongdan.lastIndexOf("/")+1);
//		System.out.println("ten bai hat la: "+ten);
//		int index=duongdan.lastIndexOf(".");
//		String ten1=duongdan.substring(duongdan.lastIndexOf("/")+1, index);
//		System.out.println("----------------------------\n"+ten1);
		
		// kiem tra chuoi doi xung
		// abcba
//		String a="abcfdcba";
//		int l=a.length();
//		boolean kq=true;
//		char c[]=a.toCharArray();
//		for(int i=0;i<l/2;i++) {
//			if(c[i]!=c[l-1-i]) {
//				kq=false;break;
//			}	
//		}
//		if(kq==true)System.out.println("la day panlyndrome");
//		else System.out.println("khong la day panlyndrome");
		
		// chuan hoa chuoi
		//vd: "  TRAN   duY THAnh     "====>"Tran Duy Thanh"
//	String ten="  TRAN   duY THAnh     ";
//		ten=ten.trim();// "TRAN    duY  THAnh"
//		String ten1[]=ten.split("\\s+");// "TRAN duY THAnh"
//		String ten2="";
//		for(int i=0;i<ten1.length;i++) {
//			String ten3=ten1[i].toLowerCase();// "tran duy thanh"
//			if(ten3.length()>0) {
//				ten3=ten3.replaceFirst(ten3.charAt(0)+"", (ten3.charAt(0)+"").toUpperCase());
//				ten2=ten3+" ";
//			}
//			System.out.print(ten2);
//		}
		

//		String a1[]=ten.split("\\s+");// "TRAN duY THAnh"
//		String a2="";
//		for(String s:a1) {
//			String a3=s.toLowerCase();// "tran" "duy" "thanh"
//			if(a3.length()>0) {
//				a3=a3.replaceFirst(a3.charAt(0)+"", (a3.charAt(0)+"").toUpperCase());
//				a2=a2+a3+" ";
//			}
//			System.out.println(a2);
//		}
		
//		String a="chao may tao la tam";
//		System.out.println(length1(a));
		ArrayList <String>arr=new ArrayList <String>();
		arr.add("alo");
		arr.add("obama");
		ArrayList <String>arr1=new ArrayList<String>();
		arr1.addAll(arr);
		System.out.println("arr1 la:");
		ArrayList <String>arr2=new ArrayList<String>();
		arr2.add("obama");
		arr2.retainAll(arr1);
		arr2.removeAll(arr);
		System.out.println("arr2 la:");
		for(String a:arr2) {
			System.out.println(a);
		}
		
	}

}
