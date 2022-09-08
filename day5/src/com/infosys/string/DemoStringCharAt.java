package com.infosys.string;

public class DemoStringCharAt {

	public static void main(String[] args) {
		String str="hello";
		char ch=str.charAt(0);
		System.out.println(ch); //h
	    ch=str.charAt(1);
		System.out.println(ch); //e
		ch=str.charAt(20);  // Exception in the code because we mentioned 20
		//String index out of range: 20
		// but we dont have any character in 20th position
		System.out.println(ch);
	}

}
