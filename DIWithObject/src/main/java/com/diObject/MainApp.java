package com.diObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
		
		Employee e=(Employee)con.getBean("emp");
		e.show();
		
	}

}
