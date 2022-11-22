package com.apti.xworkz.boot;

public class Lower {

	public static void main(String[] args) {
		   String s="XWORKZ";
	        String result = "";
	        char ch = ' ';
	        for (int i = 0; i < s.length(); i++) {
	            
	            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
	                ch = (char)(s.charAt(i) + 32);
	            }
	            else {
	                ch = (char)(s.charAt(i));
	            }
	            
	            result += ch; 
	            
	        }
	        
	        System.out.println(result);
	}

}
