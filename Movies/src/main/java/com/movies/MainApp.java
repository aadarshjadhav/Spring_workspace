package com.movies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext con= new ClassPathXmlApplicationContext("MySpring.xml");
		Movie mov_obj=(Movie)con.getBean("movie_bean");
		
		mov_obj.display();
	}

}
