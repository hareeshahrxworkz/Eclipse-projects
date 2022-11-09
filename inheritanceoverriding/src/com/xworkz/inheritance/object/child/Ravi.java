package com.xworkz.inheritance.object.child;

import com.xworkz.inheritance.object.parent.Criminal;

public class Ravi extends Criminal {
	
	public String nativeName;

	public Ravi(String criminalName, String crime) {
		super(criminalName, crime);
	}

	public Ravi(String criminalName, String crime, String nativeName) {
		this(criminalName, crime);
		this.nativeName = nativeName;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println(this.nativeName);
	}
	

}
