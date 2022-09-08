package com.infosys.string;

public class DemoStringConcat1 {
// We should not think that s1 is getting altered as we are writing s1.concat(s2)
// after s2 concatenated to s1, entirely a new string is created whose
// reference we are storing in s3.
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		
		String s3=s1.concat(s2);
		System.out.println(s3); // helloworld	
		System.out.println(s1); // hello

	}

}
