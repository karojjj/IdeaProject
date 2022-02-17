package com.group.exercise1;

public class Task4Alternativeway {

	public static void main(String[] args) {
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.

		int[][] numbers = { 
				
				{ 12, 43, 6, 19, 101,45 },// row 1==>6 elements

				{ 11, 25, 58, 899, 97,78 } // row 2==>6 elements
         };

		int sumeven = 0;
		int sumodd = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[0].length; j++) {

				if (numbers[i][j] % 2 == 0) {

					sumeven += numbers[i][j];
				}

			}
		}

		System.out.println("Sum of all even numbers is " + sumeven);
		System.out.println("-----------------------------------------");

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[0].length; j++) {

				if (numbers[i][j] % 2 != 0) {

					sumodd += numbers[i][j];
				}

			}
		}

		System.out.println("Sum of all odd numbers is " + sumodd);

	}

}
