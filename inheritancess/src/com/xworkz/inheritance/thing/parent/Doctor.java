package com.xworkz.inheritance.thing.parent;

import com.xworkz.inheritance.thing.Child.Dentist;

public class Doctor 
{
	public String name;
	public String specilist;
	public String gender;
	
	public void Doctors(Dentist dentist)
	{
System.out.println("Dentist naditha ede");
		System.out.println(dentist.name);
		System.out.println(dentist.specilist);
		System.out.println(dentist.gender);

		
	}
}
