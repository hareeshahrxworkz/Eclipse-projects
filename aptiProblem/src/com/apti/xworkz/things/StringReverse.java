package com.apti.xworkz.things;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String a = "harish is good boy",ns="";
		char ch;
//		
//		String a1= a.replaceAll("\\s", "");
//		
//		System.out.println(a1);
//		
		
		for (int i = 0; i < a.length(); i++) {
			
			ch=a.charAt(i);
			ns=ch+ns;
			
		}
		System.out.println(ns);
	
	}

}
