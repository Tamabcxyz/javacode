package thuchanhonline.lthdt.ctu.edu.vn;

public class Hourly extends Employee {
	private int hoursWorked;
	public void addHours(int morehours) {
		this.hoursWorked=morehours;
	}
	public double pay() {
		return this.hoursWorked*50;
	}
	public String toString() {
		return super.toString()+"gio lam viec "+this.hoursWorked+" luong "+pay();
	}
}
