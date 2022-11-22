package com.apti.xworkz.boot;

public class AmstrongNUmber {
	
	public static void main(String[] args) {
		int num=153 ,n ,sum=0 , flag=1;
		
		flag=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
			
			
		}
		if(sum==flag)
		{
			System.out.println("is arm Strong number" +sum);
		}
		else {
			System.out.println("Not Armstrong Number"+sum);
		}
	}

}
