package thuchanhonline.lthdt.ctu.edu.vn;

public class SD_RunnableofThread {

	public static void main(String[] args) {
		Hoc_Runnable qt1=new Hoc_Runnable();
		Hoc_Runnable qt2=new Hoc_Runnable();
		Hoc_Runnable qt3=new Hoc_Runnable();
		Thread tt1=new Thread(qt1);
		Thread tt2=new Thread(qt2);
		Thread tt3=new Thread(qt3);
		tt1.setName("truyen trinh a");
		tt2.setName("truyen trinh b");
		tt3.setName("truyen trinh c");
		tt1.start();
		
		
		
		tt2.start();
		
		
		
		tt3.start();
		
	}

}
