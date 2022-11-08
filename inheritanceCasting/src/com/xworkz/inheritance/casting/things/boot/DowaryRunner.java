package com.xworkz.inheritance.casting.things.boot;

import com.xworkz.inheritance.casting.things.child.GirlDowary;
import com.xworkz.inheritance.casting.things.parent.Dowry;

public class DowaryRunner {
	public static void main(String[] args) {
		System.out.println("main naditha ede");
		Dowry dowary=new GirlDowary("Girl", 50000, "10grms");
		System.out.println(dowary.dowaryType);
		System.out.println(dowary.Chain);
		System.out.println(dowary.amount);
	}

}
