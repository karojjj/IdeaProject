package com.group.exercise1;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

int [][] numbers= {
				
				{2, 4, 6, 8, 10, 12},
				{1, 3, 5, 7, 9, 11}		
		};
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[0].length; j++) {
				
				if(numbers[i][j]%2==0) {
				
				System.out.print(numbers[i][j]+" ");
			}
		}
		
		}
	}
}