package com.infosys.arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("Suresh");
		long numbers[]= {8763452432L,9845423478L,8754674321L};
		employee.setMobileNumbers(numbers);
		System.out.println("The details");
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		numbers=employee.getMobileNumbers();
		for(long mobileno : numbers) {
			System.out.println(mobileno);
		}

	}

}
