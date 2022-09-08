package com.infosys.string;

public class DemoSubstring1 {

	public static void main(String[] args) {
		String str="welcome";
		String sub=str.substring(3); // 3 here is the startIndex and we 
		// have not mentioned any end index so it display the characters till
		// the end of the string
		System.out.println(sub);
	}

}
