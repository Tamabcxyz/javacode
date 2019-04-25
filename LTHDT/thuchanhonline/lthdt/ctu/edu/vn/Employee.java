package thuchanhonline.lthdt.ctu.edu.vn;

public class Employee extends StaffMember{
	protected String socialSercurityNumber;
	protected double payRate;
	
	public String getSocialSercurityNumber() {
		return socialSercurityNumber;
	}
	public void setSocialSercurityNumber(String socialSercurityNumber) {
		this.socialSercurityNumber = socialSercurityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 200;
	}
	public String toString() {
		return super.toString()+" so bao ve xa hoi: "+this.socialSercurityNumber+" muc tra: "+this.payRate;
	}
	
}