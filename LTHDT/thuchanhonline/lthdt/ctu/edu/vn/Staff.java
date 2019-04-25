package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.ArrayList;

public class Staff {
	private ArrayList<StaffMember>staffList;
	
	
	public Staff() {
		super();
		staffList=new ArrayList<StaffMember>();
	}
	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMember(StaffMember mb) {
		staffList.add(mb);
	}
	public void payDay() {
		for(StaffMember s:staffList) {
			System.out.println(s);
		}
	}
}
