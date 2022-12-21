package com.apti.xworkz.boot;

import java.util.Iterator;

public class Practise {

	public static void main(String[] args) {

		int num =9,org=num,arr=num, rem, rev = 0 ,fact=1 ,temp=num,count=0,flag=0;
		Integer arm=0;

//		while (num > 0) {
//
//			rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//		
//		}
////		System.out.println(rev);		
//
//
//	
//
//	
//	//Number is armstrong number  or not
	while(temp>0) {
		temp=temp/10;
		count++;
	}
//while(num>0) {
//	
//	rem=num%10;
//	rev=rev*10+rem;
//	num=num/10;
//	
//}	
//if(rev==org)
//{
//System.out.println("is palindrome number : "+rev);
//
//}
//else {
//	System.out.println("is not plindrome number : "+rev);
//}
//System.out.println(org);  
//	
while(org>0) {
	
	rem=org%10;
	arm=Math.pow(rem, count)+arm;
	org=org/10;
	
}
if(arm==arr)
{
System.out.println("given number is Armstrong no :  "+arm);	

}
else
{
	System.out.println("given number is Not Armstrong no :  "+arm);	
}
		
		
//for(int i=2;i<=num/2;i++)
//{
//if (num%i==0) {
//flag=1;
//break;
//}	
//}
//
//if(flag==0)
//{
//	System.out.println("is prime no : "+num);
//	
//}
//else
//{
//	System.out.println("is not prime "+num);
//}


for(int i=1;i<=5;i++)
{
	fact=fact*i;
	
}
System.out.println(fact);
int n1=1,n2=2,n3; 
for(int i=0;i<5
		;i++)
	
{
	n3=n1+n2;
	System.out.println("fibonici series is "+n1+""+n2+""+n3);
	
	n1=n2;
	n2=n3;
	
}


	}
}

