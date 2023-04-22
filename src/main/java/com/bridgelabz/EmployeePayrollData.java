package com.bridgelabz;

public class EmployeePayrollData {

	public int id;
	public String name;
	public double salary;
	
	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id = "+id+"salary = "+salary+"name = "+name;
	}
	
}
