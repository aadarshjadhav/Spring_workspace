package com.project.MundriSoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.MundriSoft.iservice.IEmployeeService;
import com.project.MundriSoft.models.Employee;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/employee_info")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeservice;
	
	@GetMapping("/getallEmployees")
	public List<Employee> getAllEmployees()
	{
		System.out.println("Inside EmployeeController GetAllEmpoyees");
		return employeeservice.getAllEmployees();
	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee e)
	{
		System.out.println("Inside saveEmployee");
		Employee res=null;

		try {
			res=employeeservice.saveEmployee(e);
			System.out.println("Save Employee Done");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@PutMapping("/updateEmployeeInfo")
	  public Employee updateUserInfo(@RequestBody Employee u) {
		Employee res=null;
	    System.out.println("inside EmployeeInfo"+ "Emp_id:"+u.getEmployee_id() + " Emp_name:"+u.getEmployee_name());
	    
	    try {
	      res=employeeservice.updateEmployee(u);
	      System.out.println("Employee updated");
	    }catch(Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	    return res;
	  }
	

	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		try 
		{
			employeeservice.deleteEmployee(id);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	

	@GetMapping("/searchEmployeeById/{id}")
    public ResponseEntity<Employee> searchProductById(@PathVariable int id) {
		Employee employee = employeeservice.searchEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
	
	

}
