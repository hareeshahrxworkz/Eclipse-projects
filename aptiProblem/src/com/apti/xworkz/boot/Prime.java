package com.apti.xworkz.boot;

public class Prime {

	public static void main(String[] args) {
		 int num=1,flag=0;
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				flag=1;
				break;
			}
				
		}
		if(flag==0)
		{
			System.out.println("given the number is prime :"+num);
		}
		else
		{
			System.out.println("given number is not prime :"+num);
		}
		
		
		
	}

}
