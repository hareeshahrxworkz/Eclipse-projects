package com.xworkz.inheritance.thing.Child;

import com.xworkz.inheritance.thing.parent.Doctor;

public class Dentist extends Doctor{
	
	public String dentistName;
	public String age;
	
	public void dentistDetiles(Dentist dentist)
	{
		System.out.println("Dentist Naditha ede");
		System.out.println(dentist.dentistName);
		System.out.println(dentist.age);
		System.out.println(dentist.name);
		System.out.println(dentist.specilist);
		System.out.println(dentist.gender);




	}
	
	
	

}
