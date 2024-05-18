package com.project.MundriSoft.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.MundriSoft.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
	
//	@Query("SELECT u FROM Employee u")
//	List<Employee> findAllEmployees(); //Since you are using inbuilt finAll(), there is no need for this customer function

}
