package com.myinternet.study;

public class LabeledForloop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Label for outer and for loop  
	    aa:  
	        for(int i=1;i<=3;i++){  
	        	
	           
	            	
	                for(int j=1;j<=3;j++){  
	                	
	                    if(i==2&&j==2){  
	                    	
	                        break aa;  
	                    }  
	                    
	                    System.out.println(i+" "+j);  
	                }  
	        }  
	}  
}  
	


