package com.infosys.arrays;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int[] num=new int[15];  // Array declaration and initialisation
		Scanner scan=new Scanner(System.in);	
		   for(int i=0;i<num.length;i++)
	       {
			   System.out.println("Enter the number");
	    	   num[i]=scan.nextInt();
	       }
	  System.out.println("The entered numbers");
       for(int i=0;i<num.length;i++)
       {
    	   System.out.println(num[i]);
       }
		
	}

}
