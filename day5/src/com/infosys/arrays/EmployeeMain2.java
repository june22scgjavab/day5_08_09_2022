package com.infosys.arrays;

import java.util.Scanner;

public class EmployeeMain2 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=scanner.nextInt();
		employee.setEmployeeId(id);
		System.out.println("Enter the name");
		String name=scanner.next();
		employee.setEmployeeName(name);
		System.out.println("Enter the number of mobile numbers");
		int num=scanner.nextInt();
		long numbers[]=new long[num];
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Enter the number");
			numbers[i]=scanner.nextLong();
		}
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
