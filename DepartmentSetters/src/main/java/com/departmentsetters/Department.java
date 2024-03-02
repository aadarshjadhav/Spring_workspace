package com.departmentsetters;

public class Department {
	
	int depart_id;
	String depart_name;
	String depart_location;

	Employees emp_obj;
	
	public Employees getEmp_obj() {
		return emp_obj;
	}
	public void setEmp_obj(Employees emp_obj) {
		this.emp_obj = emp_obj;
	}
	public int getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(int depart_id) {
		this.depart_id = depart_id;
	}
	public String getDepart_name() {
		return depart_name;
	}
	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}
	public String getDepart_location() {
		return depart_location;
	}
	public void setDepart_location(String depart_location) {
		this.depart_location = depart_location;
	}
	
	 public void setEmployeeDetails(int emp_id, String emp_name, int salary) {
	        Employees employee = new Employees();
	        employee.setEmp_id(emp_id);
	        employee.setEmp_name(emp_name);
	        employee.setSalary(salary);
	        this.emp_obj = employee;
	    }
	
	public void depart_display()
	{
		System.out.println(" Department_id:"+depart_id+" Departname:"+depart_name+" Department Location:"+depart_location+ " Employee:"+emp_obj);
	}

}
