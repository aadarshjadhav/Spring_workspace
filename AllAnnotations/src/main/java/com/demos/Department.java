package com.demos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Department {
	
	@Value(value="3311")
	private int dep_id;
	@Value(value="Quality Assurrance")
	private String dep_name;
	
	
	public Department() {
		
	}


	@Override
	public String toString() {
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + "]";
	}
	
	
	

}
