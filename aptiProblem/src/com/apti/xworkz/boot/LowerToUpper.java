package com.apti.xworkz.boot;

public class LowerToUpper {
	  
	    public static void main(String[] args) {
	        String s="lower";
	        String result = "";
	        char ch = ' ';
	        for (int i = 0; i < s.length(); i++) {
	            
	            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
	                ch = (char)(s.charAt(i) - 32);
	            }
	            else {
	                ch = (char)(s.charAt(i));
	            }
	            
	            result += ch; 
	            
	        }
	        
	        System.out.println();
	        
	            
	    }

}
