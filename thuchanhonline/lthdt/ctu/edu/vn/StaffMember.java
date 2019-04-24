package thuchanhonline.lthdt.ctu.edu.vn;

public abstract class StaffMember {
	protected String name,address,phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public StaffMember(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public StaffMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "ten"+getName()+" dia chi: "+getAddress()+" so dien thoai: "+getPhone();
	}
	public abstract double pay();
}
