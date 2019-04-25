package thuchanhonline.lthdt.ctu.edu.vn;

public class Hoc_Thread extends Thread{
	public void run() {
		super.run();
		try {
			for(int i=0;i<=10;i++) {
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName()+"i la: "+i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
