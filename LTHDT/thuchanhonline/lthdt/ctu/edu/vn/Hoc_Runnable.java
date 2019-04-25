package thuchanhonline.lthdt.ctu.edu.vn;

public class Hoc_Runnable implements Runnable {

	@Override
	public void run() {// nap de phuong thuc run()
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName()+" i la "+i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
