package com.mrityunjay.bean;

public class Criminal {

	private String name;
	private int age;
	private String gender;
	private String address;
	private String identityMark;
	private String crimeArea;
	private String crimeName;

	
	
	
	public Criminal() {
		
	}
	
	public Criminal(String name, int age, String gender, String address, String identityMark, String crimeArea,
			String crimeName) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.identityMark = identityMark;
		this.crimeArea = crimeArea;
		this.crimeName = crimeName;
	}
	
	@Override
	public String toString() {
		return "Criminal [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", identityMark=" + identityMark + ", crimeArea=" + crimeArea + ", crimeName=" + crimeName + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentityMark() {
		return identityMark;
	}
	public void setIdentityMark(String identityMark) {
		this.identityMark = identityMark;
	}
	public String getCrimeArea() {
		return crimeArea;
	}
	public void setCrimeArea(String crimeArea) {
		this.crimeArea = crimeArea;
	}
	public String getCrimeName() {
		return crimeName;
	}
	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}
	
	
}
