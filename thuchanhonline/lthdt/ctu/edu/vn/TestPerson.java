package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person>dsPerson=new ArrayList<Person>();
		Person an=new Man();
		an.setFirstName("An");
		dsPerson.add(an);
		((Man)an).isWatchingFootball();
		Person kim=new Woman();
		kim.setFirstName("Kim");
		((Woman)kim).isWearingMakup();
		dsPerson.add(kim);
		for(Person p: dsPerson) {
			if(p instanceof Man) {
				System.out.println(p.getFirstName()+" la giong duc");
			}
			if(p instanceof Woman) {
				System.out.println(p.getFirstName()+" la giong cai");
			}
		}

	}

}
