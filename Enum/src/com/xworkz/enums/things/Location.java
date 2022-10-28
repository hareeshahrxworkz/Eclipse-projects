package com.xworkz.enums.things;

import com.xworkz.enums.EnumClass;

public class Location {

	public String name;
	public EnumClass enums;
	public String country;
	public long pincode;
	public Names [] names;

	
	public void setNames(Names [] names)
	{
		
		this.names=names;
		
	}
	public Location(String name, EnumClass enums, String country, long pincode) {
		super();
		this.name = name;
		this.enums = enums;
		this.country = country;
		this.pincode = pincode;
	}
	
	public void display()
	{
		
		System.out.println("location naitha ede");
		System.out.println(this.name);
		System.out.println(this.enums);
		System.out.println(this.country);
		System.out.println(this.pincode);
		
		for (int i = 0; i < names.length; i++) {
			Names name = this.names[i];
			System.out.println(name);
		}
	}



	
}
