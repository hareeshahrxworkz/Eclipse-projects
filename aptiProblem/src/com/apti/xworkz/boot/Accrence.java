package com.apti.xworkz.boot;

import java.util.Scanner;

public class Accrence {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num ,rem=0 ,count=0;
		while (num>=0)
		{
		rem=num%10;
		count++;
		num=num/10;
		}
		System.out.println("Count"+count+""+num);
		
	}

}
