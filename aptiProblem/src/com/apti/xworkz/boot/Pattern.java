package com.apti.xworkz.boot;

public class Pattern {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n||i==1||i==n||i==3||j==3) {
					System.out.print(" *");
				}
				else if(i==2||j==3){
					System.out.print("  ");
				}
				else {
					System.out.print("  ");

				}
			
			}
			System.out.println("");

		}

	}

}
