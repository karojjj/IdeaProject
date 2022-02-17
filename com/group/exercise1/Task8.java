package com.group.exercise1;

public class Task8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int [] numbers= {12, 24, 24, 56, 45, 6, 90, 103};
		
		int maximum=numbers[0];
		
		for(int num:numbers) {
			
			if(num>maximum) {
				maximum=num;			
			}
		}
			System.out.println("Maximum number in the array is "+maximum);
		
			//Minimum number
			
		
		int minimum=numbers[0];
		
		for(int num:numbers) {
			
			if(num<minimum) {
				minimum=num;		
			}
		}
		System.out.println("Minimum number in the array is "+minimum);
	}

}
