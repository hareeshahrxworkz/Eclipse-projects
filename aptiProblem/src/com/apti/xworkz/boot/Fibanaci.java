package com.apti.xworkz.boot;

public class Fibanaci {

	public static void main(String[] args) {

		
		int n=0,n1=1,n2;
		
		System.out.println(n);
		for (int i = 2; i < 10; i++) {
			
			n2=n+n1;
			System.out.println(+ n2);
			
			n=n1;
			n1=n2;
			
		}
	}

}
