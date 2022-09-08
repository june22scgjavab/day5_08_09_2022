package com.infosys.arrays;

public class Demo12 {

	public static void main(String[] args) {
		int numbers[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int nums[] : numbers) {
			for(int n : nums) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}

	}

}
