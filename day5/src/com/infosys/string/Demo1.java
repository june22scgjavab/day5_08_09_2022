package com.infosys.string;
// If you have missed writing main, write m and press ctrl+spacebar
public class Demo1 {
public static void main(String[] args) {
	String str1="hello"; // For line 5 it will check the string pool for the string
	// hello. In this case as this is the first line , no hello is found in the 
	// string pool so the hello is placed in the string pool.
	String str2="hello"; // In line 8, again we wrote str2 = hello, so in this case
	// again it will check whether we have hello in the string constant pool or
	// not. hello is already there because of line 5. So this time a new string
	// hello is not placed in the string pool but str2 also points to the same
	// string literal hello which got created in line 5.
	System.out.println(str1==str2); // true as it is comparing the address.
	System.out.println(str1.equals(str2)); //true because comparing the data 
	// as str1 and str2 is pointing to the same data
}
}
