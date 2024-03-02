package com.beanLife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext con= new	ClassPathXmlApplicationContext("MySpring.xml");
	
		Test t= (Test)con.getBean("MyBean");
		  
		t.display();
		con.registerShutdownHook();

		
	}

}
