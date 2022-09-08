package com.infosys.arrays;

public class Demo9 {

	public static void main(String[] args) {
		int num[][]=new int[3][3]; // 3 rows and 3 cols
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				System.out.print(num[row][col]+"\t");
			}
			System.out.println();
		}

	}

}
