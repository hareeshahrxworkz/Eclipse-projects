package com.apti.xworkz.boot;

public class swap {

	
	  
	    
	 
	    public static void main(String args[])
	    {
	        String str = "Hareesha  Xworkz";
	        
	     
	 
	      
	        char[] ch = str.toCharArray();
	 
	       
	        char temp = ch[0];
	        ch[0] = ch[ch.length - 1];
	        ch[ch.length - 1] = temp;
	 
	        
	      
	 
	        System.out.println(String.valueOf(ch));
	    }
	
		
		
	}


