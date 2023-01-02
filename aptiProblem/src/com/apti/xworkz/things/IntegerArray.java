package com.apti.xworkz.things;

public class IntegerArray {


	public int twice(int dad, int son) 
	{
		
		if(dad>=son)
		{
		int years= 2 * son - dad;
		 return years;
		}
		else 
		{
			
		System.out.println("You are Entered age is dad grether then son How it possible");	
		return 0;
		}
	
	}
}
