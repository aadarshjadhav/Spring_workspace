package com.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
		Car cobj=(Car)con.getBean("car");
		cobj.show();
	}

}
