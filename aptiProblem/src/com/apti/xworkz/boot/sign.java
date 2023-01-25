package com.apti.xworkz.boot;

import java.util.ArrayList;

public class sign {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("start pyramyd ==================================");
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println(" ");
		
		}
		System.out.println("down pyramyd ==================================");

		for (int l = n ; l >= 1; l--) {
			for (int j = n - 1; j >= l; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= l; k++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
		
		String name = "Hareesha is a good boy ", ns = "";
		for (int i = 0; i < name.toCharArray().length; i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				ns += ch;
			}
		}
		System.out.println(ns);

		int count = 0, cnstonent = 0;

		for (int i = 0; i < name.toCharArray().length; i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
				count++;
			} else {
				cnstonent++;
			}
		}

		System.out.println(count);
		System.out.println(cnstonent);

		int num = 5, mul = 1, reg = 2;

		for (int i = 0; i <num; i++) {
			mul = mul * reg;
		}
		System.out.println(mul);

		int[] arr = { 2, 5, 7, 4, 3 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hareesha");
		arrayList.add("MAnu");
		arrayList.add("Rajan");
		arrayList.add("Govind");
		arrayList.add("bala");

		System.out.println(arrayList);
		for (String a : arrayList) {
			System.out.println(a);

		}
		
		
		int countt=0;
		for(int i=0;i<name.toCharArray().length;i++)
		{
			if(name.charAt(i)==' ')
			{
				countt++;
			}
		}
		System.out.println(countt);
		
		
		
		
		int coun=1;
		while (coun<=15)
		{
			System.out.println(coun %2==1?"####":"****" );
			++coun;
		}
		
		

	}

}
