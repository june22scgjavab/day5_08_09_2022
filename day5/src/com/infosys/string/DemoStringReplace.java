package com.infosys.string;

public class DemoStringReplace {

	public static void main(String[] args) {
	String str="jiny";
	String str2=str.replace('i', 'e');
    System.out.println(str); //jiny
    System.out.println(str2); //jeny
    
    String str3="Hello friends how are you?";
    String str4=str3.replace(' ','#');
    System.out.println(str4);
	}

}
