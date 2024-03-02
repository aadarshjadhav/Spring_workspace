package com.DItest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	int id;
	int salary;
	String name;
	public Employee(int id)
	{
		this.id=id;
	}
	public Employee(String name)
	{
		this.name=name;
	}
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void show()
	{
		System.out.println("ID= "+id+" "+"Name= "+name+" sal="+ salary);
	}

}
