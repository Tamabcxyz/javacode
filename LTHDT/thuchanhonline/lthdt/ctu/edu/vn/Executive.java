package thuchanhonline.lthdt.ctu.edu.vn;

public class Executive extends Employee {
	private double bonus;
	public void awarBonus(double bonus) {
		this.bonus=bonus;
		System.out.println("lanh bonus "+bonus);
	}
	public double pay() {
		return super.payRate+this.bonus;
	}
}
