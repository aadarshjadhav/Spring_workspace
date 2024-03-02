package com.scopeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scopeDemo.HelloWorld;


public class App {
	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("MySpring.xml");
		HelloWorld h1=(HelloWorld)con.getBean("MyBean");


		h1.setMsg("This is Singleton");
		h1.show();
		
		HelloWorld h2=(HelloWorld)con.getBean("MyBean");
		h2.show();
		

	}

}
