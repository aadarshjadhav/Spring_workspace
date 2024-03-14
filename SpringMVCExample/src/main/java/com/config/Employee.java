package com.config;

public class Employee {

	private String empname;
	private int empid;
	private double empsal;
	
	public Employee() {
		
	}
	
	

	public Employee(String empname, int empid, double empsal) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
	}



	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empsal=" + empsal + "]";
	}
	
	
	
	
	
	
}
