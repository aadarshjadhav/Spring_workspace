package com.annotationsqualifiers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	

		
		public static void main(String[] args) {
			
			ApplicationContext con=new ClassPathXmlApplicationContext("Qualifier.xml");
			
			 Department d=(Department)con.getBean("d");
			 
			 d.print();
		

	}

}
