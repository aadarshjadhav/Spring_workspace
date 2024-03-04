package com.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration annotation:it is a calss level annoation, which indicates that an object is a source of bean defintion.

@Configuration
public class AppConfig {
	
	
	//it is the annotation which is method level annotation, and it is applied on the method to specify that it returns a bean to be managed by spring context
	@Bean(name="person")
	public Person getPerson()
	{
		Person p = new Person();
		p.setPer_id(111);
		p.setPer_name("Aadarsh");
		p.setPer_emailid("aadarsh@gmail.com");
		
		return p;
	}
}