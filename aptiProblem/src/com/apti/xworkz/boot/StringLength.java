package com.apti.xworkz.boot;

public class StringLength {

	public static void main(String[] args) {
		int l = 0;

		String s = "Hareesha";
		for (char c1 : s.toCharArray())
			l++;
		System.out.println("Length of String is : " + l);

	}

}
