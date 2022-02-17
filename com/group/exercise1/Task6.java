package com.group.exercise1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		/*
		 * A prime number is a number that is divisible by only two numbers: 1 and
		 * itself. So, if any number is divisible by any other number, it is not a prime
		 * number.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");

		int number = input.nextInt();

		boolean primeNum = true;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				primeNum = false;
				break;
			}
		}
		if (primeNum) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}