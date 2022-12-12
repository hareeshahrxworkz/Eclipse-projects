package com.apti.xworkz.boot;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		
	String str="H a r e e s s h a";
	String ns ="";
//	String str1= str.replaceAll("\\s", ""); 
//    
//    System.out.println("After Removing Whitespace string:"+str1);
	int count=0;
	char[]a=str.toCharArray();
	for(int i=0;i<str.length();i++)
		
	{
		if(str.charAt(i)!=' ')
		{
			ns=ns+str.charAt(i);	}
	}
    System.out.println(ns);

}
}