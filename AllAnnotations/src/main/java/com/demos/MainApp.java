package com.demos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con= new AnnotationConfigApplicationContext(Employee.class,Department.class);
		Employee e1= con.getBean("emp", Employee.class);
		System.out.println(e1);

	}

}