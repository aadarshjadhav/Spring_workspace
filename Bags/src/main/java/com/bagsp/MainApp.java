package com.bagsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con= new ClassPathXmlApplicationContext("MySpring.xml");
		Bag bag_obj=(Bag)con.getBean("bag_bean");
		
		bag_obj.show();
	}

}
