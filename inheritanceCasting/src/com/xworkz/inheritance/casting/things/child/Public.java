package com.xworkz.inheritance.casting.things.child;

import com.xworkz.inheritance.casting.things.parent.Dj;

public class Public extends Dj {
	
	public Public(String djName, String djlocation, int no_Of_Boxes) {
		super(djName,djlocation,no_Of_Boxes);
		System.out.println("Main naditha ede");
	}

}
