package com.DItest;

import java.util.List;

public class Employee {
	
	int id;
	int salary;
	String name;
	List<String> dept;


	public Employee(int id,String name,int salary,List<String> dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}

	public void show()
	{
		System.out.println("ID= "+id+" "+"Name= "+name+" sal="+ salary);
		
		System.out.println(dept);
	}

}
