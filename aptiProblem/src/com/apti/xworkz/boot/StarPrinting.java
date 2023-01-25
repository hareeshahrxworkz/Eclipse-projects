package com.apti.xworkz.boot;

import java.util.Iterator;

public class StarPrinting {

	public static void main(String[] args) {

		System.out.println("Printing Star Horizantal");

		for (int i = 0; i <= 5; i++) {
			System.out.println("*");
			System.out.println(" ");

		}
		System.out.println("Printing vertical");
		for (int i = 0; i <= 5; i++) {

			System.out.print("*");

		}

		System.out.println("Printing Matrix box type");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("H");

			}
			System.out.println(" ");
		}

		System.out.println("Printing Matrix box type");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i);

			}
			System.out.println(" ");
		}

		System.out.println("Printing name box type");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {

				if (j == 3) {
					System.out.print("H");
				} else {
					System.out.print(i);

				}

			}
			System.out.println(" ");
		}

		System.out.println("Printing center name box type");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {

				if (i == 2) {
					System.out.print("hareesha");
				} else {
					System.out.print(i);

				}

			}
			System.out.println(" ");
		}

		System.out.println("down Rectangle printing");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {

				System.out.print("*");

			}
			System.out.println("");

		}
		System.out.println(System.lineSeparator());

		System.out.println("right Rectangle printing");
		for (int i = 1; i <= 5; i++) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("left Rectangle printing");
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println("");

		}

		System.out.println("left Rectangle printing");

		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("Hareesha");
				} else {

					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("Hareesha");
				} else {
					System.out.print(k);

				}
			}
			System.out.println("");

		}

		System.out.println("reight down Rectangle printing");
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(k + " ");
			}
			System.out.println("");

		}

		System.out.println("up triangle  printing");
		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println("");
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--)

			{
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");

		}

	}

}
