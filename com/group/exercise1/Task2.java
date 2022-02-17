package com.group.exercise1;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers= {
				
				{10, 20, 30,40},
				{5, 15, 25, 35}		
		};
				int sum=0;
				for(int i=0; i<numbers.length; i++) {
					for(int j=0; j<numbers[0].length; j++) {
						sum+= numbers[i][j];
						
					}}
					
					System.out.println("The sum of all the numbers is "+sum);
	}
}