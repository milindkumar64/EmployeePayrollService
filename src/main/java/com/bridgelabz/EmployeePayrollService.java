package com.bridgelabz;

import java.util.*;

public class EmployeePayrollService {
	
	public enum IOService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {
		
	}
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		super();
		this.employeePayrollList = employeePayrollList;
	}

	private void readEmployeePayrollData(Scanner sc) {
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Employee name : ");
		String name = sc.next();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
	}
	private void writeEmployeePayrollData() {
		System.out.println("\n Writting Employee Payroll Roaster to Consol\n"+employeePayrollList); 
	}

	public static void main(String[] args) {
		
		ArrayList <EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner sc = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(sc);
		employeePayrollService.writeEmployeePayrollData();
		

	}

}
