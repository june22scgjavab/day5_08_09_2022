package com.infosys.arrays;

public class Demo1 {
// Arrayname.length ===> will return the number of elements
	public static void main(String[] args) {
		int[] num=new int[15];
		int length=num.length;
		System.out.println(length);
       for(int i=0;i<num.length;i++)
       {
    	   System.out.println(num[i]);
       }
		
	}

}
