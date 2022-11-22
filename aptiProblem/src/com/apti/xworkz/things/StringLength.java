package com.apti.xworkz.things;

public class StringLength {
	
	public static void main(String[] args) {
		
		String a = "Banni java kalioyona ";
		int count = 0;
		
	//	System.out.println(a.length());
		
		for(char c : a.toCharArray()) {
			count++;
		}
		
		System.out.println(count);
	}

}
