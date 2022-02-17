package com.group.exercise1;

public class Task9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

int[] numbers= {230, 526, 760, 887, 92, 463};
		
		int largest=0;
		int secondLargest=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				secondLargest=largest;
				largest=numbers[i];
				
			}else if (numbers[i]>secondLargest) {
				secondLargest=numbers[i];
				
			}
			
		}
		
		System.out.println("The second largest number is "+secondLargest);
	}
	

}
