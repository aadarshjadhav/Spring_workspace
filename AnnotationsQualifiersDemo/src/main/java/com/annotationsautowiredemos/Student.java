package com.annotationsautowiredemos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private Integer age;
	private String name;
	public Integer getAge() {
		return age;
	}
	
	@Autowired(required=false)
//	@Value("25")
	public void setAge(Integer age)
	{
		this.age=age;
	}
	
//	@Required
//	public void setAge(Integer age) {
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	


}
