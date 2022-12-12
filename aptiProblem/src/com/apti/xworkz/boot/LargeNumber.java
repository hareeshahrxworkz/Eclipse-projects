package com.apti.xworkz.boot;

public class LargeNumber {
	public static void main(String[] args) {
		int[] a = { 10, 15, 65, 20, 90, 8, 30, 100 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(System.lineSeparator());
		System.out.println(a[a.length - 1]);
	}

}
