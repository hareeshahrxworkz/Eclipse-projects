package com.apti.xworkz.boot;

public class MaxMin {

	public static void main(String[] args) {
		int a[]= {45,333,76,29,900,23,474,654,29,454 };
		
		int max=a[0];
		int min=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
				
			}
		}

	System.out.println("Minimu number "+min);
	System.out.println("Maximum number "+max);
	}

}
