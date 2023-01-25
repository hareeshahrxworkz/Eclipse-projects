package com.apti.xworkz.boot;

import java.util.Iterator;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		int num = 9, org = num, arr = num, rem, rev = 0, fact = 1, temp = num, count = 0, flag = 0;
		double arm = 0;

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
		while (temp > 0) {
			temp = temp / 10;
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
		while (org > 0) {

			rem = org % 10;
			arm = Math.pow(rem, count) + arm;
			org = org / 10;

		}
		if (arm == arr) {
			System.out.println("given number is Armstrong no :  " + arm);

		} else {
			System.out.println("given number is Not Armstrong no :  " + arm);
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

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
		int n1 = 1, n2 = 2, n3;
		for (int i = 0; i < 5; i++)

		{
			n3 = n1 + n2;
			System.out.println("fibonici series is " + n1 + "" + n2 + "" + n3);

			n1 = n2;
			n2 = n3;

		}

		System.out.println("New starting=================================================================");
		int n = 4;

		for (int i = 0; i <= n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print(" *");
			}
			System.out.println(" ");

		}

		for (int i = 0; i <= n; i++) {

			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
			
			System.out.println(" ");

		}

		for (int i = n - 1; i >= 1; i--) {

			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");

		}

		Scanner sc = new Scanner(System.in);
		String ovel = sc.next();

		int ovels = 0, cons = 0;

		char[] ch = ovel.toCharArray();

		String lower = ovel.toLowerCase();

		for (int i = 0; i < lower.toCharArray().length; i++) {
			lower.charAt(i);
			if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' || lower.charAt(i) == 'o'
					|| lower.charAt(i) == 'u') {
				ovels++;
			} else {
				cons++;
			}

		}
		System.out.println("Ovel:" + ovels);
		System.out.println("consonents  :" + cons);

		int[] a = { 2, 10, 25, 33, 21 };
		int k = 0;
		for (int i : a) {

			k = i + k;

		}
		System.out.println(k);

		String space = "Hey May Name Is Prince", ns = "";

		for (int i = 0; i < space.toCharArray().length; i++)
			if (space.charAt(i) != ' ') {

				ns += space.charAt(i);

			}
		System.out.println(ns);

		System.out.println("-==========================================");

		int s = 5, m = 1, v = 2;

		for (int i = 0; i < s; i++) {
			m = m * v;
		}

		System.out.println("2's power  " + s + "  is  " + m);

		int u = (int) 10000L;
		System.out.println("-----------------------------"+u);

	}
}
