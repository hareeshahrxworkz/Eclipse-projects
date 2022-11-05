package com.apti.xworkz.boot;

import java.util.Scanner;

public class MultiplayRunner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
				
		int len=String.valueOf(num).length();
		System.out.println(len);
		
		int result=num*(5*len);
		System.out.println(result);
	}

}
