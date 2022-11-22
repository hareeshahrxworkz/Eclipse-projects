package com.apti.xworkz.boot;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		
	String str="H a r e e s s h a";
	String str1= str.replaceAll("\\s", ""); 
    
    System.out.println("After Removing Whitespace string:"+str1); 

}
}