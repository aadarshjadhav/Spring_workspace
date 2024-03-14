package com.config;

public class Customer {
	
	private int cid;
	private String cname;
	private int age;
	private String email;
	private String gender;
	

	public Customer() {
	}

	

	public Customer(int cid, String cname, int age, String email, String gender) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.email = email;
		this.gender = gender;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", age=" + age + ", email=" + email + "]";
	}
	
	

}
