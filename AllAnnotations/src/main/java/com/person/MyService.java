package com.person;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {

	@Autowired
	Person p;
	
	public void show()
	{
		p.doWork();;
	}
}