package com.project.MundriSoft.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee_info")
public class Employee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="employee_id")
	private int employee_id;
	
	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="department_id")
	private int department_id;
	
	@Column(name="employee_salary")
	private double employee_salary;

}
