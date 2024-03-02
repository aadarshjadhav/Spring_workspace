package com.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Allows spring to detect our custom bean automatically, we can use this across the application to maark the beans spring managed componenent
@Component("emp") //This is annotation name, and this name emp should be same as in the MainApp class .getBean("emp",Employee.class)
public class Employee {
	
	@Value(value="101") //This value annotation is used to pass values for the variables 
	private int emp_id;
	@Value(value="Aadarsh")
	private String emp_name;
	@Value(value="20000")
	private double emp_salary;
	
	@Autowired
	Department dep_obj;
	
	public Employee() {
		
		System.out.println("Inside Default Constructor");
		
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "Department"+dep_obj+"]";
	}
	
	
	

}
