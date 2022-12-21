package com.apti.xworkz.boot;

import java.util.Scanner;

import com.apti.xworkz.things.IntegerArray;

public class IntegerArrayRunner {
public static void main(String[] args) {

    int []array= {1,2,3,4,5};
    for (int i = 0; i < array.length; i++) {
		int j = array[i]+array[i];
		
		System.out.println(j);
	
    	
    }
    
	
	IntegerArray Integers=new IntegerArray();
	
	Scanner dadYears=new Scanner(System.in);
	Scanner sonYears=new Scanner(System.in);
 
	int dadYear=dadYears.nextInt();
	int sonYear=dadYears.nextInt();
	
	
	int yearsAgo=Integers.twice( dadYear, sonYear);
	
    System.out.println("Years Age"+yearsAgo);
    
    
	
	

	
	
	
	
	
}
	
}
