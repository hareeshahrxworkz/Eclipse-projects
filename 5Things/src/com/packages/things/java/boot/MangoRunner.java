package com.packages.things.java.boot;

import com.packages.things.java.Mango;
import com.packages.things.java.Mango.Location;

public class MangoRunner {

	public static void main(String[] args) {

			
		Mango mango=new Mango();
		mango.setMango(Location.CHITRADURGA, 500);
		mango.weight=30;
		mango.display();
		
		
	}

}
