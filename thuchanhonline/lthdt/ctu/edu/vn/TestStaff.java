package thuchanhonline.lthdt.ctu.edu.vn;

public class TestStaff {

	public static void main(String[] args) {
		Staff s=new Staff();
		Employee a=new Employee();
		a.setName("tran van a");
		a.setAddress("3/2 can tho");
		a.setPhone("123");
		a.setPayRate(1.23);
		a.setSocialSercurityNumber("abcd1234");
		s.addStaffMember(a);
		
		Executive an=new Executive();
		an.setName("nguyen thi an");
		an.setAddress("30/4 tran phu");
		an.setPayRate(2.6);
		an.setPhone("3456");
		an.setSocialSercurityNumber("bcda4321");
		an.awarBonus(100);
		s.addStaffMember(an);
		s.payDay();
	}

}
