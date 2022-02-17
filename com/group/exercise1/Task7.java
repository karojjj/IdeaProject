package com.group.exercise1;

public class Task7 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=1; i<=10; i++) {
			
			num3=num1+num2;
			
			System.out.print(num3+" ");
			
			num1=num2;
			num2=num3;
	}

}
}
