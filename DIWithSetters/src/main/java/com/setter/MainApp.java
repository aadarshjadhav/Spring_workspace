package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
		
		  Student st=(Student)con.getBean("stud");
		  
		  st.display();
		  
		  System.out.println(st.getMarks());

	}

}
