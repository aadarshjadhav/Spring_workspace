package com.project.MundriSoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.MundriSoft.iservice.IEmployeeService;
import com.project.MundriSoft.models.Employee;
import com.project.MundriSoft.repositories.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService implements IEmployeeService{

	@Autowired
	private EmployeeRepo employeerepo;

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("Inside Employee Service GetAllEmpoyees");
		List<Employee> employeelist = employeerepo.findAll();
		
		return employeelist;
	}
	
	@Transactional
	@Override
	public Employee saveEmployee(Employee u) {
		
		System.out.println("Inside saveEmployee");
		Employee res= employeerepo.save(u);
		System.out.println("res: Emp Name:"+ res.getEmployee_name()+ " Emp Sal:" +res.getEmployee_salary());
		return res;
	}

	@Transactional
	@Override
	public Employee updateEmployee(Employee c) {
		
		System.out.println("Inside EmployeeService updateEmployee:" + c.getEmployee_id());
		Employee employee = employeerepo.save(c);
		System.out.println("after employeerepo.save(c):"+ employee.getEmployee_name());
	    return employee;
	  }

	@Override
	public void deleteEmployee(int id) {
		
		employeerepo.deleteById(id);
		
	}

	@Override
	public Employee searchEmployeeById(int id) {

//		@SuppressWarnings("deprecation")
		Employee employee = employeerepo.findById(id).get();
        
        return employee;
	}


	
	


}
