package com.bridgelabz;

import java.util.Arrays;

import org.junit.Test;

import com.bridgelabz.EmployeePayrollService.IOService;

import junit.framework.Assert;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldbeMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = { 
				new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zuck", 300000.0), };
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
	}

}
