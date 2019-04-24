package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class TroChoiSoBiMat {
	public static int gameSecret() {
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int numbersecret=0, numberplayer=0,diem=5;System.out.print("diem hien tai la: "+diem+"\n");
		
		while(diem<10) {
			numbersecret=rd.nextInt(4);
			do {
				numberplayer=sc.nextInt();
				if(numberplayer!=numbersecret) {
					diem=diem-1;System.out.print("diem bi -1 "+"diem ="+diem+"\n");
					if(diem==0) {
						System.out.println("ban da thua trong tro choi nay @@");return 0;
					}	
				}else {
					diem=diem+1;System.out.print("diem duoc +1 "+"diem ="+diem+"\n");	
				}
			}while(numberplayer!=numbersecret);
			if(diem==10) {
				System.out.println("ban da thang trong tro choi doan so ^^");break;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("so bi mat 0==>3 da san sang may hay nhap so m du doan di nao");
		System.out.println("luu y: neu may nhap sai diem se bi tru di 1");
		gameSecret();
	}

}
