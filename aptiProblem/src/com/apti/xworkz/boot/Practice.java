package com.apti.xworkz.boot;

public class Practice {

	public static void main(String[] args) {

		//String Reverse
		String  name="h a r e e s h a ",addition="";
		
//		for(int i=0;i<name.toCharArray().length;i++)
//		{
//			addition=addition+name.charAt(i);
//		}
//		
//		System.out.println(addition);
		
		
		//remove whitespace
		
		for(int i=0;i<name.toCharArray().length;i++)
		{
			char ch=name.charAt(i);
			if(ch>='a'&&ch<='z')
				
			{
				char c=(char) ((char) ch -32);
				addition=addition+c;
			}
			
			

			
		}
		System.out.println(addition);

	}

}
