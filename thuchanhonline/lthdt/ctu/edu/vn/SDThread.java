package thuchanhonline.lthdt.ctu.edu.vn;

public class SDThread {

	public static void main(String[] args) {
		Hoc_Thread ht=new Hoc_Thread();
		ht.start();
		Hoc_Thread ht1=new Hoc_Thread();
		ht1.start();
		Hoc_Thread ht2=new Hoc_Thread();
		ht2.start();
	}

}
