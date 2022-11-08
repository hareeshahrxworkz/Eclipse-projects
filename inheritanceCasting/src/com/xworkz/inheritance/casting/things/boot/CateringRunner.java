package com.xworkz.inheritance.casting.things.boot;

import com.xworkz.inheritance.casting.things.child.Choutry;
import com.xworkz.inheritance.casting.things.parent.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		System.out.println("Main naditha ede");
		Catering cat=new Choutry("Viranjaneya", 20, "manju");
		System.out.println(cat.TeamName);
		System.out.println(cat.ownerName);
		System.out.println(cat.noOfMembers);


		
	}

}
