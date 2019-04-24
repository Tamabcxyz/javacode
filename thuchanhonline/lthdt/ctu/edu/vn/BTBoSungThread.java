package thuchanhonline.lthdt.ctu.edu.vn;
/*
public class BTBoSungThread extends Thread{
	public void run() {
		while(true) {
			try{
				System.out.println("day la da tuyen trinh cua chuong trinh con");
				Thread.sleep(100);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BTBoSungThread bt=new BTBoSungThread();
		bt.start();
		System.out.println("day la da tuyen trinh cua main");
	}

}
*/

/*public class BTBoSungThread extends Thread{
	static Thread th;
	public void run() {
		System.out.println("da tuyen trinh cua chuong trinh con");
	}

	public static void main(String[] args) {
		th=new BTBoSungThread();
		System.out.println("day la da tuyen trinh cua main");
		System.out.println("day la da tuyen trinh cua main1");
		th.start();
		
	}

}
*/
public class BTBoSungThread extends Thread{
	static Thread th;
	public BTBoSungThread() {
		System.out.println(Thread.currentThread().getName());
		th=new Thread(this);
		System.out.println("thread th alive"+th.isAlive());
		th.setName("thread of ham xay dung");
		th.start();
		
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
		System.out.println(th.currentThread().isAlive());
	}

	public static void main(String[] args) {
		new BTBoSungThread();
		
	}

}
