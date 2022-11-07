package com.xworkz.inheritance.thing.Child;

import com.xworkz.inheritance.thing.parent.Doctor;

public class Ent extends Doctor{
	public String Ent;
	public long  contactNo;
	
	public void EntList(Ent ent)
	{
		System.out.println("ent Naditha ede");

		System.out.println(ent.Ent);
		System.out.println(ent.contactNo);
		System.out.println(ent.name);
		System.out.println(ent.gender);
		System.out.println(ent.specilist);



		
	}

}
