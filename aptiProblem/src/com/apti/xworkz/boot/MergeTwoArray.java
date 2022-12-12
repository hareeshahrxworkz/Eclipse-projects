package com.apti.xworkz.boot;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		int[] a = { 10, 20, 50, 41, 65, 11 };
		int[] b = { 50, 60, 78, 25, 41, 14 };
		int[] c = new int[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}

		for (int i = 0; i < b.length; i++) {
			c[count++] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println(System.lineSeparator());
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + " ");

			
		}
		System.out.println(System.lineSeparator());

		for(int i=0;i<c.length;i++)
		{
			if (c[i] == key) {
				System.out.println("You are Searching no already in array   :"+c[i]);
			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Third gretest number is   :" + a[a.length - 3]);

	}
}