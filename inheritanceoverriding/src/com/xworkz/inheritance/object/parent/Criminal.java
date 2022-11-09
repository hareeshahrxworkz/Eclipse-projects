package com.xworkz.inheritance.object.parent;

public class Criminal {
	public String criminalName;
	public String crime;

	public Criminal(String criminalName, String crime) {
		super();
		this.criminalName = criminalName;
		this.crime = crime;
	}
	
	public void display()
	{
		System.out.println(this.criminalName);
		System.out.println(this.crime);
		
		
	}

}
