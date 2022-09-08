package com.infosys.string;

public class DemoStringEqualsIgnore {
public static void main(String[] args) {
	String str1="hello";
	String str2="hello";
	String str3="hi";
	String str4="Hello";
	boolean b=str1.equals(str2);
	System.out.println(b);  //true
	b=str2.equals(str3);
	System.out.println(b);  //false
    b=str2.equalsIgnoreCase(str4);  //true
    System.out.println(b);
}
}
