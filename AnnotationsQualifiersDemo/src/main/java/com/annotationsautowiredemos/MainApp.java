package com.annotationsautowiredemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("RequiredDemo.xml");
		
		  Student s=(Student)con.getBean("st");
		  
		  System.out.println(s.getName()+"  "+s.getAge());
		
//		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
//		  TextEditor te=(TextEditor)con.getBean("te");
//		  
//		  te.checkText();
	}


}

