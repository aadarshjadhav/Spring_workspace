package com.config;

public class Customer {

	private int cid;
	private String cname;
	private String email;
	private String contact;
	private String address;
	

	public Customer() {
	}


	public Customer(int cid, String cname, String email, String contact, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.contact = contact;
		this.address = address;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", contact=" + contact + ", address="
				+ address + "]";
	}

	
}
