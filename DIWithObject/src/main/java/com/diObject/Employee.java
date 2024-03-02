package com.diObject;

public class Employee {

	int id;
	String name;
	Address adr;
	
	public Employee(int id,String name, Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}

	public void show()
	{
		System.out.print(id+" "+ name+ adr);
	}
}


