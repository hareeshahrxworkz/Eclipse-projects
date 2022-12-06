package com.xworkz.interfaces.rules;

import java.util.Scanner;

public class space {

	public static void main(String[] args) {
       scanner sc =new Scanner() 	;	
		
		int spaceCount = 0;
		for(char c: str.toCharArray()) {
			if (c==' ') {
				spaceCount++;
			}
		}
				
           System.out.println(spaceCount);
	}

}