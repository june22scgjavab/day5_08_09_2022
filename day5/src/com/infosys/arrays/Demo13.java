package com.infosys.arrays;
import java.util.Scanner;
public class Demo13 {
	public static void main(String[] args) {
		int numbers[][]= new int[3][4];
		Scanner scan=new Scanner(System.in);
		for(int rows=0;rows<numbers.length;rows++)
		{
			for(int cols=0;cols<numbers[rows].length;cols++)
			{
				System.out.println("Enter the data");
				numbers[rows][cols]=scan.nextInt();
			}
		}
		System.out.println("The data");
		for(int nums[] : numbers) {
			for(int n : nums) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}

	}

}
