package com.apti.xworkz.boot;

public class SpyRunner {

	public static void main(String[] args) {

		int num = 1124, sum = 0, product = 1 ,rem=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			product =product*rem;
			num=num/10;
		}
	
		System.out.println("sum is  : "+sum);
		System.out.println("product is  : "+product);
		
		if(sum==product) {
			System.out.println("Is  Spy number");

		System.out.println("sum is  : "+sum);
		System.out.println("sum is  : "+product);
		
	}
	else {
		System.out.println("Is Not Spy number");
	}	
		
		
		
		
		   // this condition is for printing the message without using semicolon
			 if(System.out.printf("This is Printing Program Without Semicolon")== null)
			 {
				 
			 }	  
		  
		  
		  
		  int s=0;
		  int [] a= {2,4,6,12};
		  
		  for (int i : a) {
			  s=s+i;
			System.out.println(i);
		}
		  System.out.println(s);
		  
			 
		}

	}
	
	
	
	


