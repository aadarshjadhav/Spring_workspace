package com.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Person p= con.getBean("person", Person.class);
		
		p.doWork();
		System.out.println(p.getPer_name());
		
		
	}

}
