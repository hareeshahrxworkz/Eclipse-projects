package com.apti.xworkz.boot;

import java.util.Scanner;

public class operetor {

	public int operation(char sign, int val1, int val2) {

		if (sign =='+') {
			int sum = val1 + val2;
			return sum;
		}
		if (sign == '-') {
			int sub = val1 - val2;
			return sub;
		}
		if (sign == '*') {
			int mul = val1 * val2;
			return mul;
		}
		if (sign == '/') {
			int div = val1 / val2;
			return div;
		}
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		char cha = sc.next().charAt(0);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();

		operetor oper = new operetor();
		int output=oper.operation(cha, value1, value2);

		System.out.println("Your output is " +output);



	}

}
