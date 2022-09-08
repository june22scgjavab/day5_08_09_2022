package com.infosys.arrays;

public class Employee {
private int employeeId;
private String employeeName;
private long mobileNumbers[];

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, long[] mobileNumbers) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.mobileNumbers = mobileNumbers;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public long[] getMobileNumbers() {
	return mobileNumbers;
}

public void setMobileNumbers(long[] mobileNumbers) {
	this.mobileNumbers = mobileNumbers;
}





}
