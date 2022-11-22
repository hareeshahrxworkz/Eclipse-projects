package com.apti.xworkz.boot;

public class Palindrome {

	public static void main(String[] args) {

		int n = 121, rev = 0, rem = 0, temp = n;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		if (temp == rev) {
			System.out.println("is palindrome   :" + rev);
		} else {
			System.out.println("is not palindrome " + rev);
		}

		String name = "kanaka", store="", tem;
		tem = name;
		char ch;
		{
			for (int i = 0; i < name.length(); i++) {
				ch = name.charAt(i);

				store = ch + store;

			}

			if (tem .equals( store)) {
				System.out.println("is   palindrome  :" + store);
			} else {
				System.out.println("is  not   palindrome  :" + store);

			}

		}
	}
}
