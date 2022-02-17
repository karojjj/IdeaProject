package com.group.exercise1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Create an array on int values using a scanner and 
		//calculate the sum of all stored elements in that array.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();

		int[] numbers = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the numbers");
			numbers[i] = input.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("The sum of all the elements in array is equal to " + sum);

	}

}
