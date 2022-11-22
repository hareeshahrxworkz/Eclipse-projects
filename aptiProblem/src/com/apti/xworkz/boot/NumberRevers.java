package com.apti.xworkz.boot;

public class NumberRevers {
	public static void main(String[] args) {

		int rev = 0, rem, n = 987;

		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}

		System.out.println(rev);

		String name = "Ha   reesha",a="";
		
		System.out.println(name.replaceAll("\\s",""));
	}
}
