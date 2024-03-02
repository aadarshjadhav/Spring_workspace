package com.annotationsqualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department {


	@Autowired
	@Qualifier("emp2")
	Employee emp;
	
	public Department()
	{
		System.out.println("Inside Dempartment");
	}
	public void print()
	{
		System.out.println(emp.getId()+"  "+emp.getName());
	}
	


}
