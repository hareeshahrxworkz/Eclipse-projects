package com.apti.xworkz.boot;

import java.util.Scanner;

public class Rainboo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] color = new int[7];
		int n = 7;
		for (int i = 0; i < n; i++) {
			color[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				int temp = color[i];
				color[i] = color[j + 1];
				color[j + 1] = temp;
			}
		}

		int array3[] = new int[7];
		int k2 = 0;
		int array2[] = new int[7];
		int k1 = 0;
		int array[] = new int[7];
		int k = 0;

		for (int i = n - 1; i >= 0; i--) {

			for (int j = 0; j < n; j++) {
				if (color[j] - color[i] >= 15) {
					array3[k2++] = color[i];
					System.out.println(array3[i]);

					break;

				} else if (color[j] - color[i] >= 7) {
					array2[k1++] = color[i];
					System.out.println(array2[i]);

					break;

				} else {
					array[k++] = color[i];
					System.out.println(array[i]);

					break;
				}

			}

		}


	}

}
