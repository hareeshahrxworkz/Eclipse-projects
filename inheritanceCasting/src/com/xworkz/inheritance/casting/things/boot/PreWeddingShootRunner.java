package com.xworkz.inheritance.casting.things.boot;

import com.xworkz.inheritance.casting.things.child.AfterWeddingShoot;
import com.xworkz.inheritance.casting.things.parent.PreWddingShoot;

public class PreWeddingShootRunner {
	public static void main(String[] args) {
		System.out.println("main Naditha ede");
		PreWddingShoot preWddingShoot=new AfterWeddingShoot("Mejestic",50,"cloths");
		System.out.println(preWddingShoot.no_of_shoots);
		System.out.println(preWddingShoot.location);
		System.out.println(preWddingShoot.castume);

		}

}
