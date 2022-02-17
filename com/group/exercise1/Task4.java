package com.group.exercise1;

public class Task4 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		int[][] numbers = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, // row 1 (1d array)
				{ 10, 11, 14, 16, 13, 18 }, // row 2 (1d array)
				{ 113, 124, 151, 121, 177, 198 }, // row 3 (1d array)
				{ 1234, 2412, 5122, 1211, 2141 } };// row 4 (1d array)

		int sum1=0;
		int sum2=0;
		
		int [][]numbers1= {
				
				{10,15,20},
				{25,30,36},
				{40,52,69},
				{56,65,98}
				
				};
		for(int i=0;i<numbers1.length;i++) {
			for(int j=0;j<numbers1[i].length;j++) {
			if(numbers1[i][j]%2==0)	{
		    sum1+=numbers1[i][j];
			
			}else if(numbers1[i][j]%2==1)
				sum2+=numbers1[i][j];
				
			
			}}
		System.out.println("sum of even numbers is "+sum1);
		System.out.println("sum off odd numbers is "+sum2);
			}
		}