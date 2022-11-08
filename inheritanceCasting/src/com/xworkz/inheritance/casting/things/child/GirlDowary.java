package com.xworkz.inheritance.casting.things.child;

import com.xworkz.inheritance.casting.things.parent.Dowry;

public class GirlDowary extends Dowry{
	
	public GirlDowary(String dowaryType, double amount, String chain) {
		super(dowaryType,amount,chain);
		System.out.println("Dowary naditha ede");
	}

}
