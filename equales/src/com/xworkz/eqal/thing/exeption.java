package com.xworkz.eqal.thing;

public class exeption {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int array[] = { 1, 2, 5, 8 };
		try {
			array[4] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		finally {
			for(int i:array) {
			System.out.println("exeption completed"+i);
		}}

	}

}
