package com.xworkz.inheritance.casting.things.child;

import com.xworkz.inheritance.casting.things.parent.PreWddingShoot;

public class AfterWeddingShoot extends PreWddingShoot {
	public AfterWeddingShoot(String location, int no_of_shoots, String castume) {
		super(location,no_of_shoots,castume);
		System.out.println("AfterWeddingShoot naditha ede");
	}

}
