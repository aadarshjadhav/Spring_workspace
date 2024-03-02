package com.autowirestatecitydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con= new ClassPathXmlApplicationContext("MySpring.xml");
		State st=(State)con.getBean("states");
		
		
		
		st.printStateDisplay();
		st.getC().printCityDisplay();
		
	}

}
