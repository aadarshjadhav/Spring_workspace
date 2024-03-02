package com.person;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private int per_id;
	private String per_name;
	private String per_emailid;

	
	public Person()
	{
		
	}
	
	
	
	public int getPer_id() {
		return per_id;
	}



	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}



	public String getPer_name() {
		return per_name;
	}



	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}



	public String getPer_emailid() {
		return per_emailid;
	}



	public void setPer_emailid(String per_emailid) {
		this.per_emailid = per_emailid;
	}



	public void doWork()
	{
		System.out.println("The person is doing some kind of work");
	}
	
	

	@Override
	public String toString() {
		return "Person [per_id=" + per_id + ", per_name=" + per_name + ", per_emailid=" + per_emailid + "]";
	}
	
	
	
}
