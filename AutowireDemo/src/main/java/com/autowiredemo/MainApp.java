package com.autowiredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con= new ClassPathXmlApplicationContext("MySpring.xml");
		
		//Bag b=con.getBean("b", Bag.class);
		
		Bag b=(Bag)con.getBean("b");
		
		b.printBagDisplay();
		b.getP().printPenDisplay();
	}

}
