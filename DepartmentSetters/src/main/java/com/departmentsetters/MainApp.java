package com.departmentsetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");	
		Department d_obj=(Department)con.getBean("dep");
		d_obj.depart_display();
		
	
	}

}