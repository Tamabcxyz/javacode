package thuchanhonline.lthdt.ctu.edu.vn;

public class TestParameterList {
	public static float cong(double...arr) {
		float s=0.0f;
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// cong danh sach mang so
		float sum=cong(1.2,3.4,5.6);
		System.out.println(sum);
	}

}
