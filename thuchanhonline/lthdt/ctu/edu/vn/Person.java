package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Date;

public class Person implements Mammal{
	private String firstName;
	private BloodGroup bg;
	private Address dc[];

	public BloodGroup getBg() {
		return bg;
	}
	public void setBg(BloodGroup bg) {
		this.bg = bg;
	}
	public String getFirstName() {
		return firstName;
	}
	public String toString() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setDayOfBirth(Date dob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAgeAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}
