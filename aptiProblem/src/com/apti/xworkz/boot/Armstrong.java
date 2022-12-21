package com.apti.xworkz.boot;

public class Armstrong {
	public static void main(String[] args) {
		int num=1634,count=0 ,rem ,name=num	,orig=num;
		Integer armstromg=0;
		
		while(orig>0)
		{
			orig=orig/10;
			count++;
		}
		
		while(num>0)
		{
			
			rem=num%10;
			armstromg=Math.pow(rem, count)+armstromg;
			num=num/10;
			
		}
		System.out.println(count);
		if(armstromg==name)
		{
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");

		}
		
	}

}
