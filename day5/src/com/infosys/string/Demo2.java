package com.infosys.string;

public class Demo2 {

	public static void main(String[] args) {
		String str1=new String("hello");
		String str2=new String("hello");
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); //true
		

	}

}
