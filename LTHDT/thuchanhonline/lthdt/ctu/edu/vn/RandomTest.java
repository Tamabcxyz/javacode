package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int kq=rd.nextInt(101)-50;// random tu -50 den 50
//		System.out.println(kq+"\n\n");
		System.out.println("so bi mat da san sang!!  \nmoi ban nhap so trong khoan -50->50 ");
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			n=sc.nextInt();
			if(n<kq) {
				System.out.println("so bi mat phai lon hon so "+n);
			}else if(n>kq){
				System.out.println("so bi mat phai nho hon so "+n);
			}else if(n==kq){
				System.out.println("da trung voi so bi mat ");break;
			}
		}while(n!=kq);
		
		// tao ra nhung con so khong trung lien tiep trong random
//		int temp=0, truoc=-1;
//		for(int i=0;i<5;i++) {
//			temp=rd.nextInt(5);
//			if(truoc!=temp) {
//				i++;
//				truoc=temp;
//				System.out.print(temp+" ");
//			}
//		}
		
	}

}
