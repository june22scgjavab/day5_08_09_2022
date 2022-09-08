package com.infosys.arrays;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		String names[] = new String[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the name");
			names[i] = scan.next();
		}
		System.out.println("The entered names");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
