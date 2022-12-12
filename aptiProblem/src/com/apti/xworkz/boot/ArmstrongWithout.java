package com.apti.xworkz.boot;

import java.util.Scanner;

public class ArmstrongWithout {

	public static void main(String[] args) {

		int store = 0, num = 153, temp = num, org = num, rem = 0, count = 0, dig = 1;
		while (temp > 0) {
			rem = temp % 10;
			count++;
			temp = temp / 10;

		}
		System.out.println("Count" + count);
		while (num > 0) {
			rem = num % 10;
			for (int i = 0; i < count; i++) {
				dig = dig * rem;

			}

			store = store + dig;
			dig = 1;
			num = num / 10;

		}

		if (org == store) {
			System.out.println("Is armstrong  number   :" + store);

		} else {
			System.out.println("Is Not Armstrong Number   :" + store);
		}

	}

}
