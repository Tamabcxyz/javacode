package homework;



import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public void Date(){
		ngay=1;
		thang=1;
		nam=2019;
	}
	public void Date(int d, int m, int y ){
		this.thang=m;
		this.ngay=d;
		this.nam=y;
	}
	public boolean hople(){
		int max[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		boolean hle=false;
		if(nam % 4==0)
			max[2]=29;
			hle=false;
		
		//else max[2]=28;
		if(ngay>0 && ngay<=max[thang] && thang >0 && thang<13 && nam>0)
			hle=true;
		return hle;
	}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Nhap ngay:");ngay =sc.nextInt();
		System.out.println("hap thang:");thang= sc.nextInt();
		System.out.println("Nhap nam:");nam=sc.nextInt();
		
		
		
		}while(!hople());
	}
	public void in(){
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau(){
		Date d=new Date();
		d.Date(ngay, thang ,nam);
		d.ngay++;
		if(!d.hople()){
			d.ngay=1;
			d.thang++;
			if(!d.hople()){
				d.thang=1;
				d.nam++;
			}
		}
		return d;
	}
	public Date cong(int n,Date X){
		Date d= new Date();
		d=X;
		//d.Date(ngay, thang ,nam);
		for(int i=0;i<n;i++)
			d=d.ngayHomSau();
			return d;
	}
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date ngay=new Date();
		Date ngaytang=new Date();
		System.out.println("so ngay moi:");
		ngay.nhap();
		ngay.in();
		System.out.println("So ngay tang:");
		int n=sc.nextInt();
		ngaytang=ngaytang.cong(n,ngay);
		ngaytang.in();
	}

}
