package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
		HelloWorld obj=(HelloWorld)con.getBean("MyBean");
		obj.display();

	}

}
	