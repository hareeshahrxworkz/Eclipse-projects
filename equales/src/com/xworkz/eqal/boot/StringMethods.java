package com.xworkz.eqal.boot;

import java.nio.charset.Charset;

public class StringMethods {

	
	
	public static void main(String[] args) {

		System.out.println("String Creating Leteral Way=======================================================");

		String fruite = "Apple";
		System.out.println("Strig is literal : " + fruite);
		System.out.println(System.lineSeparator());

		System.out.println("String Creating new Way=======================================================");

		String Vichal = new String("Car is Gold");

		System.out.println("String Printing new " + Vichal);

		System.out.println(System.lineSeparator());

		System.out.println("String  Concatination using method : "
				+ " Way=======================================================");

		System.out.println(Vichal.concat(" Is a Scoda"));

		System.out.println(System.lineSeparator());

		System.out.println("String  compare using method =======================================================");

		System.out.println(Vichal.compareTo(fruite));
		System.out.println(System.lineSeparator());

		System.out.println("String  CharAt each charactor using method =======================================================");
		
		char ch;
		ch=Vichal.charAt(0);
		System.out.println("it returns index of charactor in CharAt : "+ch);
		System.out.println(System.lineSeparator());

		System.out.println("String  Code pointe metho =======================================================");
		
		
		System.out.println("it returns Codepointer in codePoint : "+Vichal.codePointAt(1));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  Code pointe before metho =======================================================");
		
		
		System.out.println("it returns Codepointer in codePoint before : "+Vichal.codePointBefore(2));
		
		System.out.println(System.lineSeparator());

		System.out.println("String  Code pointe metho =======================================================");
		
		
		System.out.println("it returns Codepointer in codePoint : "+Vichal.codePointCount(1,5));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  compare to ignore case method =======================================================");
		
		
		System.out.println("it returns compare to ignore case in : "+Vichal.compareToIgnoreCase(fruite));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  contains method =======================================================");
		
//		Vichal="Car";
//		fruite ="Car";
		System.out.println("it returns contains in : "+Vichal.contains(fruite));
		

		System.out.println(System.lineSeparator());

		System.out.println("String  conatins eqal method =======================================================");
		
		
		System.out.println("it returns contains eqal in : "+Vichal.contentEquals(fruite));
		
		System.out.println(System.lineSeparator());

		System.out.println("String  conatins eqal method =======================================================");
		
		
		System.out.println("it returns contains eqal in : "+Vichal.contentEquals(fruite));
		
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  copy value of char array method =======================================================");
		
		char ca[]= {'a','b','c','d'};
		System.out.println("it returns copy value of char  in : "+Vichal.copyValueOf(ca));
		
		System.out.println(System.lineSeparator());

		System.out.println("String  copy value of char  method =======================================================");
		
		
		System.out.println("it returns copy value of char in : "+Vichal.copyValueOf(ca,0,2));

		System.out.println(System.lineSeparator());

		System.out.println("String  copy value of char  method =======================================================");
		
		
		System.out.println("it returns copy value of char in : "+Vichal.copyValueOf(ca,0,1));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  ends with  method =======================================================");
//		Vichal="Car";
//		fruite ="Car";
		
		System.out.println("it returns  ends with  of char in : "+Vichal.endsWith(fruite));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String eqals in value  method =======================================================");
		Vichal="bike";
		fruite ="bike";
		
		System.out.println("it returns eqals in value in : "+Vichal.equals(fruite));
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String  eqals ignore case  method =======================================================");
		
		
		System.out.println("it returns eqals ignore casein : "+Vichal.equalsIgnoreCase(fruite));
		
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String formate  method =======================================================");
		
		System.out.println("it returns formate in : "+String.format("hareesha %d", 12345));
		

		System.out.println(System.lineSeparator());

		System.out.println("String get default byte  method =======================================================");
		byte[] b=Vichal.getBytes();
		System.out.println("it returns get default byte in : "+b);
		
		System.out.println(System.lineSeparator());

		System.out.println("String get  byte  method =======================================================");
		
		Charset a;
		System.out.println("it returns get byte in : "+Vichal.hashCode());
		
		System.out.println(System.lineSeparator());

		System.out.println("String get  byte  method =======================================================");
		System.out.println("it returns get byte in : "+Vichal.indexOf(1));
		
		System.out.println(System.lineSeparator());

		System.out.println("String get  index  method =======================================================");
		System.out.println("it returns fron index byte in : "+Vichal.intern());
		
		
		System.out.println(System.lineSeparator());

		System.out.println("String get  Empty  method =======================================================");
		String Sambar="";
		System.out.println("it returns fron Empty byte in : "+Sambar.isEmpty());
		
		System.out.println(System.lineSeparator());

		System.out.println("String get  Empty  method =======================================================");
		System.out.println("it returns fron Empty byte in : "+Vichal.lastIndexOf(4));
		
		System.out.println(System.lineSeparator());
		String name="hareesha";
		System.out.println("String get  Length  method =======================================================");
		System.out.println("it returns fron Length byte in : "+name.length());
		
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  Matches  method =======================================================");
		System.out.println("it returns fron Matches byte in : "+Vichal.matches(name));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  off set  method =======================================================");
		System.out.println("it returns fron off set byte in : "+Vichal.offsetByCodePoints(0,2));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  replace  method =======================================================");
		System.out.println("it returns fron replace byte in : "+Vichal.replace(fruite,"Hareesha"));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  replace all  method =======================================================");
		System.out.println("it returns fron replace all byte in : "+Vichal.replaceAll("\\s","12"));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  replace first  method =======================================================");
		System.out.println("it returns fron replace first byte in : "+Vichal.replaceFirst("\\s","aa"));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  splict   method =======================================================");
		String regx="abc@ah";
		System.out.println("it returns from splict byte in : "+Vichal.startsWith(fruite));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  starts with  method =======================================================");
		System.out.println("it returns fron starts with byte in : "+Vichal.startsWith(name,2));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  sub sequence  method =======================================================");
		System.out.println("it returns fron sequence byte in : "+Vichal.subSequence(0,2));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  sub string  method =======================================================");
		System.out.println("it returns fron substring byte in : "+Vichal.substring(1));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  sub String   method =======================================================");
		System.out.println("it returns fron sub string byte in : "+Vichal.substring(0,2));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  to char array  method =======================================================");
		char c;
		System.out.println("it returns from to char array  in : "+fruite.toCharArray());
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  lowercase  method =======================================================");
		System.out.println("it returns fron lowercase byte in : "+Vichal.toLowerCase());
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  lowercase  method =======================================================");
		System.out.println("it returns fron lowercase byte in : "+Vichal.toUpperCase());
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  lowercase  method =======================================================");
		String abc="H a r e e s h a";
		System.out.println("it returns fron lowercase byte in : "+abc.trim());
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  value  method =======================================================");
		System.out.println("it returns fron value byte in : "+Vichal.valueOf(false));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  value  method =======================================================");
		System.out.println("it returns fron value byte in : "+Vichal.valueOf("a"));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  value  method =======================================================");
		System.out.println("it returns fron value byte in : "+Vichal.valueOf(12345));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  value  method =======================================================");
		System.out.println("it returns fron value byte in : "+Vichal.valueOf(1.05));
		
		System.out.println(System.lineSeparator());
		System.out.println("String get  value  method =======================================================");
		System.out.println("it returns fron value byte in : "+String.valueOf(Vichal));
		
		
	}

	
	
}
