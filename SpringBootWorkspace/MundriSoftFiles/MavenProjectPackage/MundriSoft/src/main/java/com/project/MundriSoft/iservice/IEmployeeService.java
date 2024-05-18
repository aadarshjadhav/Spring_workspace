package com.project.MundriSoft.iservice;

import java.util.List;

import com.project.MundriSoft.models.Employee;

public interface IEmployeeService {

	
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee e);
	Employee updateEmployee(Employee e);
	void deleteEmployee(int id);
	Employee searchEmployeeById(int id);
}
