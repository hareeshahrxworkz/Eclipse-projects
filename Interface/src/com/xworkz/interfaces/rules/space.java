package com.xworkz.interfaces.rules;

import java.util.Scanner;

public class space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scr = sc.nextLine();
		int spaceCount = 0;
		for (char c : scr.toCharArray()) {
			if (c == ' ') {
				spaceCount++;
			}
		}

		System.out.println(spaceCount);
	}

}