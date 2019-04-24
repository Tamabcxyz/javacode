package buoi2.lthdt.ctu.edu.vn;

public class MyTool {
	public static int uscln(int a, int b) {
		int kq = Math.abs(a);// ham lay gia tri tuyet doi
		for(int i=kq; i>0; i--)// chay tu a toi 0
			if( a%i==0 && b%i==0 )// neu 2 so a va b deu cung chia het cho 1 so thi tra ve kq
				return i;
		return 1;
	}

}
