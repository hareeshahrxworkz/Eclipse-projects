package com.packages.things.java.boot;

import com.packages.things.java.Milk;
import com.packages.things.java.Milk.MilkBrand;

public class MilkRunner {

	public static void main(String[] args) {

		Milk milk=new Milk(MilkBrand.DUDSAGAR, "25-11-2022");
		milk.price=50;
		milk.display();
			
	}

}
